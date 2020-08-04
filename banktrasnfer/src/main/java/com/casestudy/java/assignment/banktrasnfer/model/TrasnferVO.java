package com.casestudy.java.assignment.banktrasnfer.model;

/**
 * @author sunilkumar.havapnor
 *
 */
public class TrasnferVO {

	/*
	 * UI layer mapping Object
	 */
	private String sourceAccountNumber;
	private String targetAccountNumber;
	private String transferAmount;

	public TrasnferVO(String sourceAccountNumber, String targetAccountNumber, String transferAmount) {
		
		this.sourceAccountNumber=sourceAccountNumber;
		this.targetAccountNumber=targetAccountNumber;
		this.transferAmount=transferAmount;
	}

	public String getSourceAccountNumber() {
		return sourceAccountNumber;
	}

	public void setSourceAccountNumber(String sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}

	public String getTargetAccountNumber() {
		return targetAccountNumber;
	}

	public void setTargetAccountNumber(String targetAccountNumber) {
		this.targetAccountNumber = targetAccountNumber;
	}

	public String getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(String transferAmount) {
		this.transferAmount = transferAmount;
	}

	@Override
	public String toString() {
		return "TransferBO [sourceAccountNumber=" + sourceAccountNumber + ", targetAccountNumber=" + targetAccountNumber
				+ ", transferAmount=" + transferAmount + "]";
	}
}
