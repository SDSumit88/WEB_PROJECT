package com.kodbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodbook.entities.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User,Long> {
	
	 boolean existsByEmail(String email);
	 User findByEmail(String email);// for validation of user
}
