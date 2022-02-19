package com.response.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.response.model.UserResponse;
import com.response.repository.UserResponseRepository;

@Service
public class UserResponseService implements UserResponseServiceInterface {
	
	@Autowired
	UserResponseRepository userResponseRepository;

	@Override
	public List<UserResponse> showUserResponses() {
		// TODO Auto-generated method stub
		List<UserResponse> list = userResponseRepository.findAll();
		return list;
	}

	@Override
	public boolean addResponse(UserResponse response) {
		// TODO Auto-generated method stub
		boolean isAdded = false;
		try {
			userResponseRepository.save(response);
			isAdded =true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isAdded;
	}


}
