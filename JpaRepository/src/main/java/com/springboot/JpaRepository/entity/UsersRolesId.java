package com.springboot.JpaRepository.entity;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable //khi một bảng có 2 cột làm khóa chính, phải override hàm hashcode và equals
public class UsersRolesId implements Serializable {

	private static final long serialVersionUID = 4171610655597165992L;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "role_code")
	private String roleCode;

	public UsersRolesId() {
	}

	public UsersRolesId(String username, String roleCode) {
		super();
		this.username = username;
		this.roleCode = roleCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleCode == null) ? 0 : roleCode.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsersRolesId other = (UsersRolesId) obj;
		if (roleCode == null) {
			if (other.roleCode != null)
				return false;
		} else if (!roleCode.equals(other.roleCode))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsersRolesId [username=" + username + ", roleCode=" + roleCode + "]";
	}

}
