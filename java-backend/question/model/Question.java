package com.question.model;

import java.util.Arrays;

import com.response.model.Option;

//@Document(collection="Questionnaires")
public class Question {
	
//	@Id
	private int questionId;
	private String question;
	private PicId picId;
	private Option[] options;
	private String answer;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, PicId picId, Option[] options, String answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.picId = picId;
		this.options = options;
		this.answer = answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public PicId getPicId() {
		return picId;
	}

	public void setPicId(PicId picId) {
		this.picId = picId;
	}

	public Option[] getOptions() {
		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", picId=" + picId + ", options="
				+ Arrays.toString(options) + ", answer=" + answer + "]";
	}

	
	
}
