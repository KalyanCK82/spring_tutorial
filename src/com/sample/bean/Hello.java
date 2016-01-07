package com.sample.bean;

/**
* This is sample class.
*/

public class Hello {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void initialize() {
		System.out.println("In Initialize Method");
	}

	public void doDestroy() {
		System.out.println("In Destroy Method");
	}

}
