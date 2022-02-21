package com.response.service;

import java.util.List;

import com.response.model.UserResponse;

public interface UserResponseServiceInterface {
	List<UserResponse> showAllUsersResponses();
	UserResponse showUserResponses(int userId);
	boolean addResponse(UserResponse userResponse);
}
