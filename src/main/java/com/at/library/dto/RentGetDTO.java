package com.at.library.dto;

import java.io.Serializable;
import java.util.Date;

public class RentGetDTO implements Serializable{

	private static final long serialVersionUID = 4085537754352692366L;
	
	private Integer idLibro;
	private Integer idUser;
	private Date endDate;
	
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
