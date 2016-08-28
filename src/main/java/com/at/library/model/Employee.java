package com.at.library.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee implements Serializable{
	
	private static final long serialVersionUID = -3277056557610193675L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private String dni;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@OneToMany
	private List<Book> books;
	
	@OneToMany
	private List<Book> users;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Book> getUsers() {
		return users;
	}

	public void setUsers(List<Book> users) {
		this.users = users;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
	
	
	
}
