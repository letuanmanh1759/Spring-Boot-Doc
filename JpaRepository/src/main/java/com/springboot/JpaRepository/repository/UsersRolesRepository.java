package com.springboot.JpaRepository.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.JpaRepository.entity.UsersRoles;
import com.springboot.JpaRepository.entity.UsersRolesId;

@Repository
public interface UsersRolesRepository extends JpaRepository<UsersRoles, UsersRolesId> {
	@Query("SELECT ur FROM UsersRoles ur JOIN FETCH ur.user")
	List<UsersRoles> findAllHaveUser();

}
