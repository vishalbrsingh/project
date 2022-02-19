package com.question.service;

import java.util.List;

import com.question.model.Question;

public interface QuestionServiceInterface {
	List<Question> showQuestions();
	Question showQuestion(int questionId);
	boolean addQuestions(Question question);
	
}
