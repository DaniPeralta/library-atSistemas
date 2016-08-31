package com.at.library.dto;

import java.io.Serializable;

import com.at.library.enums.StatusEnum;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 3827455324138571715L;

	private Integer id;
	
	private String dni;

	private String name;
	
	private StatusEnum status;
	
	public UserDTO(){
		super();
	}
	
	public UserDTO(Integer id, String dni, String name, StatusEnum status){
		
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.status = status ;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", dni=" + dni + ", name=" + name + ", status=" + status + "]";
	}
	
	
	
}
