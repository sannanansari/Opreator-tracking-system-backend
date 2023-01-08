package com.operator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operator.Service.RegisterSerive;
import com.operator.entity.Register;

@RestController
public class LoginAndRegisterController {
	

	@Autowired
	private RegisterSerive registerSerivce;
	
	
	@GetMapping("/get")
	public String get() {
		return "Working";
	}
	@PostMapping(value= "/register")
	public Register registerUser(@RequestBody Register users) {
		System.out.println(users);
		return registerSerivce.registerUser(users);
	}

}
