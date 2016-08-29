package com.at.library.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.at.library.dto.RentPostDTO;
import com.at.library.service.RentService;

@RestController
@RequestMapping(value = "/rent")
public class RentController {
	
	@Autowired
	private RentService rentservice;
	
	private static final Logger log = LoggerFactory.getLogger(BookController.class);

	//Crear
	@RequestMapping(method = {RequestMethod.POST})
	public RentPostDTO create(@RequestBody RentPostDTO rentDTO){
		log.debug(String.format("Vamos a crear el alquiler siguiente: %s", rentDTO));
		return rentservice.create(rentDTO);
	}
	
	//Devolver
	@RequestMapping(value= "/{id}", method = {RequestMethod.DELETE})
	public boolean returnBook(@PathVariable("id") Integer id){
		log.debug(String.format("Vamos a devolver el alquiler del siguiente libro: %s", id));
		return rentservice.returnBook(id);
	}
	
	

}
