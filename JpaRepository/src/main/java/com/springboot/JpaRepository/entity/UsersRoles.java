package com.springboot.JpaRepository.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_roles")
public class UsersRoles {

	@EmbeddedId
	private UsersRolesId id;

	//fetch = FetchType.EAGER tức là khi find, select đối tượng UsersRoles từ database thì nó sẽ không lấy các đối tượng Users liên quan
	//fetch = FetchType.LAZY tức là khi find, select đối tượng UsersRoles từ database thì tất cả các đối tượng Users liên quan sẽ được lấy ra
	//Best perform: luôn để LAZY, muốn lấy User thì dùng JOIN FETCH trong Repository
	//Cascade trong SQL(sửa xóa những bảng liên quan nhau)
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@MapsId("username")
	@JoinColumn(name = "username") //JoinColumn: tên cột bảng này trong database
	private Users user;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@MapsId("roleCode")
	@JoinColumn(name = "role_code")
	private Roles role;

	public UsersRoles() {
	}

	public UsersRoles(UsersRolesId id, Users user, Roles role) {
		super();
		this.id = id;
		this.user = user;
		this.role = role;
	}

	public UsersRolesId getId() {
		return id;
	}

	public void setId(UsersRolesId id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UsersRoles [id=" + id + "]";
	}

}
