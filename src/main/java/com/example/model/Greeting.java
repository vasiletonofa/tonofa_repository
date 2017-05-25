package com.example.model;
public class Greeting {

    private String author;
    private String message;
    private String time;
    
    
	public Greeting(String author, String message, String time) {
		super();
		this.author = author;
		this.message = message;
		this.time = time;
	}


	public String getAuthor() {
		return author;
	}


	public String getMessage() {
		return message;
	}

	public String getTime() {
		return time;
	}

}