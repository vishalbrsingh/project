package com.question.model;

import org.springframework.stereotype.Component;

@Component
public class PicId {
	private int id;

	public PicId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PicId(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PicId [id=" + id + "]";
	}
	
	
}
