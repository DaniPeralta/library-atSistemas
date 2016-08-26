package com.at.library.service;

import java.util.List;

import com.at.library.dto.UserDTO;
import com.at.library.model.User;

public interface UserService {

	/**
	 * Realiza la busqueda de todos los usuarios existentes
	 * 
	 * @return listado de usuarios
	 */
	List<UserDTO> findAll();

	/**
	 * Transforma un usuario en un UserDTO
	 * 
	 * @param user
	 * @return
	 */
	UserDTO transform(User user);

	/**
	 * Transforma un UserDTO en un user
	 * 
	 * @param user
	 * @return
	 */
	User transform(UserDTO user);

	/**
	 * Crea un usuario
	 * @param user
	 * @return
	 */
	UserDTO create(UserDTO userDTO);

	/**
	 * Busca por id
	 * @param id
	 * @return
	 */
	UserDTO findById(Integer id);

	/**
	 * Actualiza usuario
	 * @param usuario
	 * @return
	 */
	void update(UserDTO userDTO);

	/**
	 * Borra usuario
	 * @param id
	 * @return
	 */
	void delete(Integer id);
}
