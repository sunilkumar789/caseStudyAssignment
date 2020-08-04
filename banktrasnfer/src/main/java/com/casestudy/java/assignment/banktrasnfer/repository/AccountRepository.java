
package com.casestudy.java.assignment.banktrasnfer.repository;

/**
 * @author sunilkumar.havapnor
 *
 * @param <T>
 */
public interface AccountRepository<T> {

	public boolean isExist(Integer accountNumber);

	public T getAccountDetails(Integer accountNumber);

	public int saveAccountDetails(T accountDetails);
}
