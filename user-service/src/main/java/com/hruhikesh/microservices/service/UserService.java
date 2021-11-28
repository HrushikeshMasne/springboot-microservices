package com.hruhikesh.microservices.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hruhikesh.microservices.ValueObj.Department;
import com.hruhikesh.microservices.ValueObj.ResponseTemplateVO;
import com.hruhikesh.microservices.entity.User;
import com.hruhikesh.microservices.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDept(Long userId) {
		// TODO Auto-generated method stub
		
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		User usr = userRepository.findByUserId(userId);
		
		//will call Dept microservice to get Dept data from dept id | achieved using RestTemplate - defined this bean in application.java
		//calling service using "department-service" apliaction name , possible because Eureka service registry and @LoadBalanced annotation on bean
		String deptMicroserviceUrl= "http://department-service/departments/" + usr.getDepartmentId();
		Department dept = restTemplate.getForObject(deptMicroserviceUrl , Department.class);
		
		responseTemplateVO.setUser(usr);
		responseTemplateVO.setDepartment(dept);
		return responseTemplateVO;
	}
	
	
}
