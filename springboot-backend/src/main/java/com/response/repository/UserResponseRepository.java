package com.response.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.response.model.UserResponse;

@Repository
public interface UserResponseRepository extends MongoRepository<UserResponse, Integer> {

}
