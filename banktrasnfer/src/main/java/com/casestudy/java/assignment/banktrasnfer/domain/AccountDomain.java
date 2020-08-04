
package com.casestudy.java.assignment.banktrasnfer.domain;

/**
 * @author sunilkumar.havapnor
 *
 */
public class AccountDomain {

	private Integer id;
	private Integer accountNumber;
	private Double amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ACCOUNT [id=" + id + ", accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}

}
