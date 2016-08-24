package com.at.library.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room implements Serializable{

	private static final long serialVersionUID = -7112342700691944339L;

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	@ManyToOne
	private List<Bookshelve> bookshelve;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Bookshelve> getBookshelve() {
		return bookshelve;
	}

	public void setBookshelve(List<Bookshelve> bookshelve) {
		this.bookshelve = bookshelve;
	}
	
	
	
}
