package com.casestudy.java.assignment.banktrasnfer.model;


/**
 * @author sunilkumar.havapnor
 *
 */
public class ResponseMessage {

	private int statusCode;
	private String statusMessage;

	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	@Override
	public String toString() {
		return "ResponseMessage [statusCode=" + statusCode + ", statusMessage=" + statusMessage + "]";
	}

}
