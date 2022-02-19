package com.question.model;

import java.util.Arrays;

//@Document(collection="Questionnaires")
public class Question {
	
//	@Id
	private int questionId;
	private String question;
	private PicId picId;
	private int[] option;
	private String answer;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, PicId picId, int[] option, String answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.picId = picId;
		this.option = option;
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

	public int[] getOption() {
		return option;
	}

	public void setOption(int[] option) {
		this.option = option;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", picId=" + picId.toString() + ", option="
				+ Arrays.toString(option) + ", answer=" + answer + "]";
	}

	
	
	
}
