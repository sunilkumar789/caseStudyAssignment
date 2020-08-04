package com.casestudy.java.assignment.banktrasnfer.exception;

import java.util.Arrays;

/**
 * @author sunilkumar.havapnor
 *
 */
public class RestException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;
	private Object[] args;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

	@Override
	public String toString() {
		return "RestException [message=" + message + ", args=" + Arrays.toString(args) + "]";
	}

	public RestException() {
		super();
	}

	public RestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RestException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestException(String message) {
		super(message);
	}

	public RestException(Throwable cause) {
		super(cause);
	}

}