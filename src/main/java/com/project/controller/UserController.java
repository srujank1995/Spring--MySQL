package com.project.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.userEntity;
import com.project.repository.userRepo;
import com.project.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
@Controller
public class UserController {
	
	@Autowired
	private  userRepo urepo;
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<userEntity> getAllUsers() {
		return urepo.findAll();
	}
	
	@PostMapping("/create")
	public userEntity createMember(@RequestBody userEntity user) {
		
		user.setCreatedAt(new Date());
		user.setUpdatedAt(new Date());
		
		return urepo.save(user);
	}
	@PostMapping("/add")
	public userEntity addMember(@RequestBody userEntity user) {
				
		return service.addMember(user);
	}
	
	
}
