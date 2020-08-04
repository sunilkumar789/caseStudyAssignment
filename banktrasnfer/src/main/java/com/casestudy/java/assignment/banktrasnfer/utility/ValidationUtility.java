package com.casestudy.java.assignment.banktrasnfer.utility;

/**
 * @author sunilkumar.havapnor
 *
 */
public class ValidationUtility {

	/**
	 * @param accountNumber
	 * @return
	 */
	public static boolean isValidAccountNumber(Integer accountNumber) {
		if (accountNumber > 0)
			return true;
		return false;

	}

	/**
	 * @param amount
	 * @return
	 */
	public static boolean isValidTransferAmount(Double amount) {
		if (amount > 0.0)
			return true;
		return false;

	}

}
