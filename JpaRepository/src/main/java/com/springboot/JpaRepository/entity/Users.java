package com.springboot.JpaRepository.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "address")
	private String address;

	@Column(name = "enabled")
	private Boolean enabled;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user") //mappedBy: tên thuộc tính trong class UsersRoles
	private Set<UsersRoles> usersRoles;

	public Users() {

	}

	public Users(String username, String password, String address, Boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.enabled = enabled;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UsersRoles> getUsersRoles() {
		return usersRoles;
	}

	public void setUsersRoles(Set<UsersRoles> usersRoles) {
		this.usersRoles = usersRoles;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", address=" + address + ", enabled="
				+ enabled + "]";
	}

}
