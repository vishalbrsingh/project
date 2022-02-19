package com.response.model;

import java.util.Arrays;

//@Document(collection="userQResponse")
public class UserResponse {
	
//	@Id
	private int userId;
	private Option[] responses;
	
	public UserResponse() {
		// TODO Auto-generated constructor stub
	}

	public UserResponse(int userId, Option[] responses) {
		super();
		this.userId = userId;
		this.responses = responses;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Option[] getResponses() {
		return responses;
	}

	public void setResponses(Option[] responses) {
		this.responses = responses;
	}

	@Override
	public String toString() {
		return "UserResponse [userId=" + userId + ", responses=" + Arrays.toString(responses) + "]";
	}

	
}
