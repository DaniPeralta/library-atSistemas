package com.at.library.service;

import java.util.List;

import com.at.library.dto.BookDTO;

public interface RentDownloadService {
	
	/**
	 * Descarga todos los libros del servicios de tercero
	 * 
	 */
	List<BookDTO> downloadAll();


}
