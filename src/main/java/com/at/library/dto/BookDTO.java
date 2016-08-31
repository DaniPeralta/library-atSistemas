package com.at.library.dto;

import java.io.Serializable;

public class BookDTO implements Serializable {

	private static final long serialVersionUID = 1583585532736761521L;

	private Integer id;

	private String isbn;

	private String title;

	private String author;
	
	//private String status -> rented, solamente.
	//private StatusEnum status;
	
	private String status; 
	
	private Integer year;
	
	private String image;

	private String description;
	
	public BookDTO(){
		super();
	}
	
	public BookDTO(Integer id, String isbn, String title, String author, String status, Integer year, String image,
			String description) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.status = status;
		this.year = year;
		this.image = image;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}
	
}
