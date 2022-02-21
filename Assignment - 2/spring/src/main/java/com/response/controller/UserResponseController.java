package com.response.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.response.model.UserResponse;
import com.response.service.UserResponseServiceInterface;

@RestController
public class UserResponseController {
	
	@Autowired
	UserResponseServiceInterface userResponseServiceInterface;
	
	@GetMapping("/allResponses")
	List<UserResponse> showUserResponses() {
		return userResponseServiceInterface.showAllUsersResponses();
	}
	
	@GetMapping("/userResponses/{userId}")
	UserResponse showUserResponses(@PathVariable int userId) {
		return userResponseServiceInterface.showUserResponses(userId);
	}
	
	@PostMapping("/addUserResponses")
	boolean addResponse(@RequestBody UserResponse responses) {
		return userResponseServiceInterface.addResponse(responses);
		
	}
	

}
