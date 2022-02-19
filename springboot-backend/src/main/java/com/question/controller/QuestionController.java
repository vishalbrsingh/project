package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question.model.Question;
import com.question.service.QuestionServiceInterface;

@RestController
public class QuestionController {
	
	@Autowired
	QuestionServiceInterface questionServiceInterface;
	
	@GetMapping("/allQuestions")
	List<Question> showQuestions() {
		return questionServiceInterface.showQuestions();
	}
	
	@GetMapping("/question/{questionId}")
	Question showQuestion(@PathVariable int questionId) {
		return questionServiceInterface.showQuestion(questionId);
	}
	
	@PostMapping("/addQuestion")
	boolean addQuestions(@RequestBody Question question) {
		return questionServiceInterface.addQuestions(question);
	}
	

}
