package com.question.service;

import java.util.List;

import com.question.model.Question;
import com.response.model.UserResponse;

public interface QuestionServiceInterface {
	List<Question> showQuestions();
	boolean addResponse(UserResponse responses );
}
