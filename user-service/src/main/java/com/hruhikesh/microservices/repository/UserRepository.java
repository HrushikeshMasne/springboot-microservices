package com.hruhikesh.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hruhikesh.microservices.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserId(Long userId);

}
