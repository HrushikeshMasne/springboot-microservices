package com.hruhikesh.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hruhikesh.microservices.entity.Department;
import com.hruhikesh.microservices.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/departments")
@Slf4j					 //for logs
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
  
	@PostMapping("/")
	public Department SaveDept(@RequestBody Department department) {
		//log.info("Inside DepartmetCOntroler | SaveDept Method()");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		//log.info("Inside DepartmetCOntroler | findDepartmentById Method()");
		return departmentService.findDepartmentById(departmentId);
	}
	
	@GetMapping("/getAllDept")
	public List<Department> getAllDept() {
		//log.info("Inside DepartmetCOntroler | findDepartmentById Method()");
		return departmentService.getAllDept();
	}
	
}
