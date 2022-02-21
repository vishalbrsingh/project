package com.question.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.model.PicId;
import com.question.model.Question;
import com.question.repository.QuestionRepository;
import com.response.model.Option;

@Service
public class QuestionService implements QuestionServiceInterface {
	
	@Autowired
	QuestionRepository questionRepository;

	@Override
	public List<Question> showQuestions() {
		List<Question> list = questionRepository.findAll();
		return list;
	}
	
	/*
	 * showQuestion method will find the question by using questionId.
	 * If no question is found against the questionId, then 
	 * the method will return dummy object with -1 value.
	 */
	@Override
	public Question showQuestion(int questionId) {
		// TODO Auto-generated method stub
		Option[] noValue = {new Option(-1, "-1")};
		Question question = new Question(-1, "empty", new PicId(-1), noValue, "-1");
		Optional<Question> res = questionRepository.findById(questionId);
		if(res.isPresent()) {
			question = res.get();
		}
		return question;
	}

	/*
	 * addQuestions method will return true if the question is successfully 
	 * inserted in the database or else will return false.
	 */
	@Override
	public boolean addQuestions(Question question) {
		// TODO Auto-generated method stub
		boolean isAdded = false;
		try {
			questionRepository.save(question);
			isAdded =true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isAdded;
	}


}
