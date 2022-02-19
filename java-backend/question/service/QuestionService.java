package com.question.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.question.model.PicId;
import com.question.model.Question;
import com.response.model.Option;
import com.response.model.UserResponse;

@Component
public class QuestionService implements QuestionServiceInterface {

	@Override
	public List<Question> showQuestions() {
		// TODO Auto-generated method stub
		Option option0 = new Option(0, "At no time");
		Option option1 = new Option(1, "Some of the time");
		Option option2 = new Option(2, "Less than half of the time");
		Option option3 = new Option(3, "More than half of the time");
		Option option4 = new Option(4, "Most of the time");
		Option option5 = new Option(5, "At all the time");
		
		Option[] options = {option0, option1, option2, option3, option4, option5};
		PicId picId1 = new PicId(1);
		PicId picId2 = new PicId(2);
		
		Question q1 = new Question(1, "Question 1", picId1, options, "");
		Question q2 = new Question(2, "Question 2", picId2, options, "");
		List<Question> list = Arrays.asList(q1,q2);
		return list;
	}

	@Override
	public boolean addResponse(UserResponse response) {
		// TODO Auto-generated method stub
		System.out.println(response.toString());
		return false;
	}


}
