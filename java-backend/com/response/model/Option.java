package com.response.model;

import org.springframework.stereotype.Component;

@Component
public class Option {
	
	private int value;
	private String response;
	
	public Option() {
		// TODO Auto-generated constructor stub
	}

	public Option(int value, String response) {
		this.value = value;
		this.response = response;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "Option [value=" + value + ", response=" + response + "]";
	}
	
	
}
