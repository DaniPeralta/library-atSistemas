package com.at.library.service;

import java.util.Calendar;
import java.util.List;

//import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.at.library.dao.BookDao;
import com.at.library.dao.EmployeeDao;
import com.at.library.dao.RentDao;
import com.at.library.dto.BookDTO;
import com.at.library.dto.RentPostDTO;
import com.at.library.dto.UserDTO;
import com.at.library.enums.StatusEnum;
import com.at.library.model.Book;
import com.at.library.model.Employee;
import com.at.library.model.Rent;
import com.at.library.model.RentPK;

@Service
public class RentServiceImpl implements RentService{

	@Autowired
	private RentDao rentDao;

	@Autowired
	private BookDao bookdao;
	
	/*@Autowired
	private DozerBeanMapper dozer;*/
	
	@Autowired 
	private BookService bookservice;
	
	@Autowired
	private UserService userservice;
	
	//Esto hay que quitarlo cuando lo implementemos
	@Autowired
	private EmployeeDao employeedao;
		
	@Override
	public List<RentPostDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RentPostDTO transform(Rent rent) {
		
		final RentPostDTO rentdto = new RentPostDTO();
		rentdto.setIdEmployee(rent.getEmployee().getId());
		rentdto.setIdLibro(rent.getRentpk().getBook().getId());
		rentdto.setIdUser(rent.getUser().getId());
		
		return rentdto;
	}

	@Override
	public Rent transform(RentPostDTO rentDTO) {
		
		final Rent rent = new Rent();
		
		//Hay que cambiarlo cuando implementemos Employee
		final Employee e = employeedao.findOne(rentDTO.getIdEmployee());
		final UserDTO u = userservice.findById(rentDTO.getIdUser());
		
		RentPK rentpk = addPK(rentDTO.getIdLibro());
		
		rent.setRentpk(rentpk);
		rent.setEmployee(e);
		rent.setUser(userservice.transform(u));
		
		return rent;
	}
	
	private RentPK addPK(Integer idLibro){
		
			final BookDTO bookdto = bookservice.findById(idLibro);
			
			RentPK rentpk = new RentPK();
			rentpk.setBook(bookservice.transform(bookdto));
			rentpk.setStartDate(Calendar.getInstance().getTime());
			
			return rentpk;
			
	}

	@Override
	public RentPostDTO create(RentPostDTO rentDTO) {
		final Rent rent = transform(rentDTO);
		
		final Book b = rent.getRentpk().getBook();
		
		System.out.println(b);
		if(bookservice.available(b.getId())){
			bookservice.changeState(b.getId());
			return transform(rentDao.save(rent));
		}
		else
			return null;
	}

	@Override
	public RentPostDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void returnBook(Integer idLibro, Integer idUser) {
		// TODO Auto-generated method stub
		
	}

	

}
