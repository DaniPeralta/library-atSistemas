package com.at.library.service;

import java.util.List;

import com.at.library.dto.RentPostDTO;
import com.at.library.model.Rent;


public interface RentService {
	
	/**
	 * Realiza la busqueda de todos los alquileres existentes
	 * 
	 * @return listado de alquileres
	 */
	List<RentPostDTO> findAll();

	/**
	 * Transforma un alquiler en un rentDTO
	 * 
	 * @param rent
	 * @return
	 */
	RentPostDTO transform(Rent rent);

	/**
	 * Transforma un rentDTO en un alquiler
	 * 
	 * @param rentDTO
	 * @return
	 */
	Rent transform(RentPostDTO rentDTO);

	/**
	 * Crea un alquiler
	 * @param book
	 * @return
	 */
	RentPostDTO create(RentPostDTO rentDTO);

	/**
	 * Buscamos el libro alquilado por un usuario y no devuelto
	 * @param id
	 * @return
	 */
	Rent findByBook(Integer idLibro);

	/**
	 * Devolver Libro alquilado
	 * @param book
	 * @return
	 */
	boolean returnBook(Integer idLibro);
	

}
