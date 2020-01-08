package com.academy.dashboard.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String title;
	private String difficulty;
	
	
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(String id, String title, String difficulty) {
		super();
		this.id = id;
		this.title = title;
		this.difficulty = difficulty;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	

}
