package com.operator.Service;

import org.springframework.stereotype.Service;

import com.operator.entity.Register;

@Service
public interface RegisterSerive {

	public Register registerUser(Register user);
}
