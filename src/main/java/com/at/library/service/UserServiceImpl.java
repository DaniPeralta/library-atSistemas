package com.at.library.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.at.library.dao.UserDao;
import com.at.library.dto.UserDTO;
import com.at.library.enums.StatusEnum;
import com.at.library.model.User;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userDao;

	@Autowired
	private DozerBeanMapper dozer;
	
	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	
	@Override
	@Scheduled(cron = "15 0/1 * * * ?")
	public void penalize(){
		log.debug("Comienza el proceso de penalización de usuarios");

	}
	
	@Override
	@Scheduled(cron = "45 0/1 * * * ?")
	public void forgive(){
		log.debug("Comienza el proceso de comprobar sanciones de usuarios");
	}
	
	@Override
	public List<UserDTO> findAll() {
		final Iterable<User> findAll = userDao.findAll();
		final Iterator<User> iterator = findAll.iterator();
		final List<UserDTO> res = new ArrayList<>();
		while (iterator.hasNext()) {
			final User u = iterator.next();
			final UserDTO uDTO = transform(u);
			res.add(uDTO);
		}
		return res;
	}

	@Override
	public UserDTO transform(User user) {
		return dozer.map(user, UserDTO.class);
	}

	@Override
	public User transform(UserDTO user) {
		return dozer.map(user, User.class);
	}

	@Override
	public UserDTO create(UserDTO userDTO) {
		final User user = transform(userDTO);
		user.setStatus(StatusEnum.ACTIVE);
		user.setStartDate(Calendar.getInstance().getTime());
		return transform(userDao.save(user));
	}

	@Override
	public UserDTO findById(Integer id) {
		final User u = userDao.findOne(id);
		return transform(u);
	}

	@Override
	public void update(UserDTO userDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		//¿Hacer así o con el FindOne?
		//Hacer con findOne
		final UserDTO u = findById(id);
		u.setStatus(StatusEnum.DISABLE);
		userDao.save(transform(u));
	}
	
	

}
