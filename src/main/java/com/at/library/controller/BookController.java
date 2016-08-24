package com.at.library.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.at.library.dto.BookDTO;
import com.at.library.service.book.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookservice;

	private static final Logger log = LoggerFactory.getLogger(BookController.class);
	
	
	@RequestMapping(method = { RequestMethod.GET })
	public List<BookDTO> getAll() {
		log.debug("Devuelve todos los libros");
		return bookservice.findAll();
	}
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public BookDTO findOne(@PathVariable("id") Integer id){
		return bookservice.findById(id);
	}
	

	//TOD0: Crear
	@RequestMapping(method = {RequestMethod.POST})
	public BookDTO create(@RequestBody BookDTO bookDTO){
		log.debug(String.format("Vamos a crear el libro siguiente: %s", bookDTO));
		return bookservice.create(bookDTO);
	}

	//TODO: Actualizar
	@RequestMapping(value= "/{id}", method = {RequestMethod.PUT})
	public void update(@PathVariable("id") Integer id, @RequestBody BookDTO bookDTO){
		log.debug(String.format("Vamos a modificar el libro: %s", bookDTO));
		bookservice.update(bookDTO);
	}
	
	//TODO: Actualizar
	@RequestMapping(value= "/{id}", method = {RequestMethod.DELETE})
	public void delete(@PathVariable("id") Integer id){
		log.debug(String.format("Vamos a borrar el libro con id: %s", id));
		bookservice.delete(id);
	}
}
