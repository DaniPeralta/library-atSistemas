package com.at.library.dto;

import java.io.Serializable;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 3827455324138571715L;

	private Integer id;
	
	private String dni;

	private String name;
	
	private String sanction;

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

	public String getSanction() {
		return sanction;
	}

	public void setSanction(String sanction) {
		this.sanction = sanction;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", dni=" + dni + ", name=" + name + ", sanction=" + sanction + "]";
	}
	
}
