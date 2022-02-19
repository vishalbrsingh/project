package com.response.service;

import java.util.List;

import com.response.model.UserResponse;

public interface UserResponseServiceInterface {
	List<UserResponse> showUserResponses();
	boolean addResponse(UserResponse responses );
}
