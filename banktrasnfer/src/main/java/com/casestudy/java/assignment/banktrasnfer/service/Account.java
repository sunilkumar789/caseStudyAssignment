package com.casestudy.java.assignment.banktrasnfer.service;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.http.ResponseEntity;

import com.casestudy.java.assignment.banktrasnfer.exception.InSufficientAmountForTransferException;
import com.casestudy.java.assignment.banktrasnfer.model.ResponseMessage;

/**
 * @author sunilkumar.havapnor
 *
 * @param <T>
 */
public interface Account<T> {

	/**
	 * @param Object
	 * @return
	 * @throws AccountNotFoundException 
	 * @throws InSufficientAmountForTransferException 
	 */
	public ResponseEntity<ResponseMessage> transferAmount(T Object) throws AccountNotFoundException, InSufficientAmountForTransferException;

}
