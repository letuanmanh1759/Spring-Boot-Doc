package com.springboot.JpaRepository;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.JpaRepository.entity.UsersRoles;

import com.springboot.JpaRepository.repository.UsersRolesRepository;

@SpringBootApplication
public class JpaRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JpaRepositoryApplication.class, args);
		UsersRolesRepository userRole = ctx.getBean(UsersRolesRepository.class);
		List<UsersRoles> userRoles = userRole.findAllHaveUser(); 
		System.out.println(userRoles);
		for(UsersRoles ur : userRoles) {
			System.out.println(ur.getUser());
		}
		
	}

}
