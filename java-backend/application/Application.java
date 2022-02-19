package com.application;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.question.model.Question;
import com.question.service.QuestionService;
import com.question.service.QuestionServiceInterface;
import com.response.model.Option;
import com.response.model.UserResponse;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
//	@Autowired
	QuestionServiceInterface qsi = new QuestionService();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Option ans1 = new Option(0, "at no time");
		Option ans2 = new Option(3, "at some time");
		Option ans3 = new Option(5, "all the time");
		Option[] responses = {ans1, ans2, ans3};
		UserResponse ur = new UserResponse(123, responses);
		qsi.addResponse(ur);
		
		List<Question> list = qsi.showQuestions();
		for(Question q : list) {
			System.out.println(q.toString());
		}
	}

}
