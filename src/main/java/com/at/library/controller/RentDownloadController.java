package com.at.library.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.at.library.dto.BookDTO;
import com.at.library.service.RentDownloadService;

@RestController
@RequestMapping(value = "/rentDownload")
public class RentDownloadController {
	
	@Autowired
	private RentDownloadService rentdownservice;
	
	private static final Logger log = LoggerFactory.getLogger(RentDownloadController.class);

	//Recuperar alquileres
	@RequestMapping(method = RequestMethod.GET)
	public List<BookDTO> download(){
		log.debug("Empezamos a descargar los libros");
		return rentdownservice.downloadAll();
	}
}
