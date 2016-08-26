package com.at.library.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.at.library.model.Book;

@Repository
public interface BookDao extends CrudRepository<Book, Integer> {
	
	 /*@Query(value = "SELECT new com.at.library.dto.BookDTO(id, isbn, title, author) from Book as b where b.id in (select r.pk.book.id from Rent as r where r.endDate is null)", nativeQuery=false)	
	public List<BookDTO> findUnavailable();*/
	
}