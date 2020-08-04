package com.casestudy.java.assignment.banktrasnfer.repository;

/**
 * @author sunilkumar.havapnor
 *
 */
public class DBQueries {

	private DBQueries() {

	}

	public static final String GET_ACCOUNT_DETAILS_BY_ACCOUNTNUMBER = "select * from TBL_ACCOUNT where accountNumber=?";
	public static final String UPDATE_ACCOUNT_DETAILS = "update TBL_ACCOUNT set amount = ? where accountNumber = ?";
	public static final String IS_EXIST_BY_ACCOUNTNUMBER = "select count(*) from TBL_ACCOUNT where accountNumber=?";

}
