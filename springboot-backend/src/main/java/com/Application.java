package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
//	Option option0 = new Option(0, "At no time");
//	Option option1 = new Option(1, "Some of the time");
//	Option option2 = new Option(2, "Less than half of the time");
//	Option option3 = new Option(3, "More than half of the time");
//	Option option4 = new Option(4, "Most of the time");
//	Option option5 = new Option(5, "At all the time");

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	
	
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Option ans1 = option5;
//		Option ans2 = option0;
//		Option ans3 = option4;
//		Option ans4 = option2;
//		Option ans5 = option3;
//		Option[] responses = {ans1, ans2, ans3, ans4, ans5};
//		UserResponse userResponse101 = new UserResponse(101, responses);
//		
//		boolean userResponseAdded = usi.addResponse(userResponse101);
//		System.out.println("userResponseAdded : " + userResponseAdded);
//		
//		List<Question> list = qsi.showQuestions();
//		for(Question q : list) {
//			System.out.println(q.toString());
//		}
//		
//		Option[] options = {option0, option1, option2, option3, option4, option5};
//		PicId picId1 = new PicId(1);
//		PicId picId2 = new PicId(2);
//		PicId picId3 = new PicId(3);
//		Question q1 = new Question(1, "I have felt cheerful and in good spirits", picId1, options, "");
//		Question q2 = new Question(2, "I have felt calm and relaxed", picId2, options, "");
//		Question q3 = new Question(3, "I have felt active and vigorous", picId3, options, "");
//		List<Question> list = Arrays.asList(q1,q2,q3);
//		
//		boolean questionAdded = qsi.addQuestions(q1);
//		System.out.println("questionAdded : " + questionAdded);
//		
//	}

}
