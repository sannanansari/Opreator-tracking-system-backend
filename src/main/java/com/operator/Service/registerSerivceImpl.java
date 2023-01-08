package com.operator.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.operator.Repository.RegisterRepo;
import com.operator.entity.Register;

@Service
public class registerSerivceImpl implements RegisterSerive {
	

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private RegisterRepo registerRepo;
	
	@Override
	public Register registerUser(Register users) {
		// TODO Auto-generated method stub
		Register user = new Register();
		
		user.setEmail(users.getEmail());
		user.setGender(users.getGender());
		user.setName(users.getName());
		user.setPassword(passwordEncoder.encode(users.getPassword()));
		user.setNumber(users.getNumber());
		System.out.println("users " + user);
		return registerRepo.save(user);
	}

}
