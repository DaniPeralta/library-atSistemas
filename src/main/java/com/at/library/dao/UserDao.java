package com.at.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.at.library.dto.UserDTO;
import com.at.library.model.User;


@Repository
public interface UserDao extends CrudRepository<User, Integer> {

	@Query(value = "SELECT new com.at.library.dto.UserDTO(id, dni, name, status) "
			+ "from User "
			+ "where (name LIKE :name OR name is null) AND (dni LIKE :dni OR dni is null)", 
			nativeQuery=false)
	public List<UserDTO> findUser(@Param("name") String name, @Param("dni") String dni);
	
}
