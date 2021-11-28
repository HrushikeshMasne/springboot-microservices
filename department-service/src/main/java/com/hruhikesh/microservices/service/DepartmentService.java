package com.hruhikesh.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hruhikesh.microservices.entity.Department;
import com.hruhikesh.microservices.repository.DepartmentRepository;

@Service
public class DepartmentService {
 
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentId(departmentId);
	}

	public List<Department> getAllDept() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
	
}
