package com.at.library.service;

import java.util.List;

import com.at.library.dto.BookDTO;
import com.at.library.model.Book;

public interface BookService {

	/**
	 * Realiza la busqueda de todos los libros existentes
	 * 
	 * @return listado de libros
	 */
	List<BookDTO> findAll();

	/**
	 * Transfrma un libro en un libroDTO
	 * 
	 * @param book
	 * @return
	 */
	BookDTO transform(Book book);

	/**
	 * Transforma un libroDTO en un libro
	 * 
	 * @param book
	 * @return
	 */
	Book transform(BookDTO book);

	/**
	 * Crea un libro
	 * @param book
	 * @return
	 */
	BookDTO create(BookDTO bookDTO);

	/**
	 * Busca por id
	 * @param id
	 * @return
	 */
	BookDTO findById(Integer id);

	/**
	 * Actualiza libro
	 * @param book
	 * @return
	 */
	void update(BookDTO bookDTO);

	/**
	 * Borra libro
	 * @param id
	 * @return
	 */
	void delete(Integer id);

}
