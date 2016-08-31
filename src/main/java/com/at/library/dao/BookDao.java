package com.at.library.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.at.library.dto.BookDTO;
import com.at.library.model.Book;

@Repository
public interface BookDao extends CrudRepository<Book, Integer> {
	
	
	@Query(value = "SELECT new com.at.library.dto.BookDTO(id, isbn, title, author, status, year, image,"
			+ " description) "
			+ "from Book "
			+ "where (isbn LIKE :isbn OR isbn is null) AND (title LIKE :title OR title is null)", 
			nativeQuery=false)
	
	public List<BookDTO> findBook(@Param("title") String title, @Param("isbn") String isbn);
	
}