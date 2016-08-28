package com.at.library.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.at.library.dto.UserDTO;
import com.at.library.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	
	//TOD0: Crear
	@RequestMapping(method = {RequestMethod.POST})
	public UserDTO create(@RequestBody UserDTO userDTO){
		log.debug(String.format("Vamos a crear el usuario siguiente: %s", userDTO));
		return userservice.create(userDTO);
	}
	
	//TODO: Borrar
	@RequestMapping(value= "/{id}", method = {RequestMethod.DELETE})
	public void delete(@PathVariable("id") Integer id){
		log.debug(String.format("Vamos a dar de baja al usuario con id: %s", id));
		userservice.delete(id);
	}

}
