package com.at.library.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Room implements Serializable{

	private static final long serialVersionUID = -7112342700691944339L;

	@Id
	private String code;

	@OneToMany(fetch = FetchType.LAZY)
	private List<Bookshelve> bookshelves = new ArrayList<>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Bookshelve> getBookshelves() {
		return bookshelves;
	}

	public void setBookshelves(List<Bookshelve> bookshelves) {
		this.bookshelves = bookshelves;
	}

	
	
	
	
}
