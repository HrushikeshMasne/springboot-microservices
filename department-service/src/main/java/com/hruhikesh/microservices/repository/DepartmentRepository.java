package com.hruhikesh.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hruhikesh.microservices.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	//JPpaRepository support query methods created with findBy<pojo_variables> , it will query it by itself
	Department findByDepartmentId(Long departmentId);

}
