package com.question.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.model.Question;
import com.question.repository.QuestionRepository;

@Service
public class QuestionService implements QuestionServiceInterface {
	
	@Autowired
	QuestionRepository questionRepository;

	@Override
	public List<Question> showQuestions() {
		// TODO Auto-generated method stub
//		Option option0 = new Option(0, "At no time");
//		Option option1 = new Option(1, "Some of the time");
//		Option option2 = new Option(2, "Less than half of the time");
//		Option option3 = new Option(3, "More than half of the time");
//		Option option4 = new Option(4, "Most of the time");
//		Option option5 = new Option(5, "At all the time");
//		
//		Option[] options = {option0, option1, option2, option3, option4, option5};
//		PicId picId1 = new PicId(1);
//		PicId picId2 = new PicId(2);
//		PicId picId3 = new PicId(3);
//		Question q1 = new Question(1, "I have felt cheerful and in good spirits", picId1, options, "");
//		Question q2 = new Question(2, "I have felt calm and relaxed", picId2, options, "");
//		Option[] noValue = {new Option(-1, "-1")};
//		Question empty = new Question(-1, "empty", new PicId(-1), noValue, "-1");
//		List<Question> list = Arrays.asList(empty);
		List<Question> list = questionRepository.findAll();
		return list;
	}


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
