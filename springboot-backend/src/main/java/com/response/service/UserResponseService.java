package com.response.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.response.model.Option;
import com.response.model.UserResponse;
import com.response.repository.UserResponseRepository;

@Service
public class UserResponseService implements UserResponseServiceInterface {
	
	@Autowired
	UserResponseRepository userResponseRepository;

	/*
	 * showAllUsersResponses method will show all the user's list with 
	 * their respective responses.
	 */
	@Override
	public List<UserResponse> showAllUsersResponses() {
		// TODO Auto-generated method stub
		List<UserResponse> list = userResponseRepository.findAll();
		return list;
	}
	
	/*
	 * showUserResponses method will find the user's responses by using userId.
	 * If no response is found against the userId, then 
	 * the method will return dummy object with -1 value.
	 */
	@Override
	public UserResponse showUserResponses(int userId) {
		// TODO Auto-generated method stub
		Option[] noValue = {new Option(-1, "-1")};
		UserResponse userResponse = new UserResponse(-1, noValue);
		 Optional<UserResponse> res = userResponseRepository.findById(userId);
		if(res.isPresent()) {
			userResponse = res.get();
		}
		return userResponse;
	}

	/*
	 * addResponse method will return true if the user's response is 
	 * successfully inserted in the database or else will return false.
	 */
	@Override
	public boolean addResponse(UserResponse userResponse) {
		// TODO Auto-generated method stub
		boolean isAdded = false;
		try {
			userResponseRepository.save(userResponse);
			isAdded =true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isAdded;
	}


}
