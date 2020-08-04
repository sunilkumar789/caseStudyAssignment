package com.casestudy.java.assignment.banktrasnfer.model;

/**
 * @author sunilkumar.havapnor
 * 
 */
public class TransferBO {

	private Integer soruceAccount;
	private Integer targetAccount;
	private double transferAmount;

	public Integer getSoruceAccount() {
		return soruceAccount;
	}

	public void setSoruceAccount(Integer soruceAccount) {
		this.soruceAccount = soruceAccount;
	}

	public Integer getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(Integer targetAccount) {
		this.targetAccount = targetAccount;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	@Override
	public String toString() {
		return "TransferBO [soruceAccount=" + soruceAccount + ", targetAccount=" + targetAccount + ", transferAmount="
				+ transferAmount + "]";
	}

}
