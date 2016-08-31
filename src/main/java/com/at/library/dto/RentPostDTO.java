package com.at.library.dto;

import java.io.Serializable;

public class RentPostDTO implements Serializable{

	private static final long serialVersionUID = 7376238822804911669L;
	
	private Integer book;
	private Integer user;
	//private Integer idEmployee;
	
	public Integer getBook() {
		return book;
	}
	public void setBook(Integer book) {
		this.book = book;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "RentPostDTO [book=" + book + ", user=" + user + "]";
	}
	
	
	
	

}
