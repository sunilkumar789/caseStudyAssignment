package com.casestudy.java.assignment.banktrasnfer.exception;

/**
 * @author sunilkumar.havapnor
 *
 */
public class AccountNotExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AccountNotExistException() {
		super();
	}

	AccountNotExistException(String exceptionMessage) {
		super(exceptionMessage);
	}

}
