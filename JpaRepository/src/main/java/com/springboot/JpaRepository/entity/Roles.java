package com.springboot.JpaRepository.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {
	
	@Id
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;

	public Roles() {
	}

	public Roles(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
