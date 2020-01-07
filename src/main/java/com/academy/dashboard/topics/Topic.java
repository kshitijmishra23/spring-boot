package com.academy.dashboard.topics;

public class Topic {
	
	private String id;
	private String title;
	private String difficulty;
	
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
