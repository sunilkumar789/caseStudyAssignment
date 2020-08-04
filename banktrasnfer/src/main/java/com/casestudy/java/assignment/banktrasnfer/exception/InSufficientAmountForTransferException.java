package com.casestudy.java.assignment.banktrasnfer.exception;

/**
 * @author sunilkumar.havapnor
 *
 */
public class InSufficientAmountForTransferException extends Exception {

	private static final long serialVersionUID = 1L;

	InSufficientAmountForTransferException() {
		super();
	}

	public InSufficientAmountForTransferException(String exceptionMessage) {
		super(exceptionMessage);
	}

}
