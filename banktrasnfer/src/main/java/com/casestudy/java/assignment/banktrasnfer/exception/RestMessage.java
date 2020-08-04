package com.casestudy.java.assignment.banktrasnfer.exception;

import java.util.List;


/**
 * @author sunilkumar.havapnor
 *
 */
public class RestMessage {
	private String message;
	private List<String> messages;

	public RestMessage(List<String> messages) {
		this.messages = messages;
	}

	public RestMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "RestMessage [message=" + message + ", messages=" + messages + "]";
	}

}