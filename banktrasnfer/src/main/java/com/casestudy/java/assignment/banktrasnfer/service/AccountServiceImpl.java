package com.casestudy.java.assignment.banktrasnfer.service;

import javax.security.auth.login.AccountNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.casestudy.java.assignment.banktrasnfer.domain.AccountDomain;
import com.casestudy.java.assignment.banktrasnfer.exception.InSufficientAmountForTransferException;
import com.casestudy.java.assignment.banktrasnfer.model.ResponseBuilder;
import com.casestudy.java.assignment.banktrasnfer.model.ResponseMessage;
import com.casestudy.java.assignment.banktrasnfer.model.TransferBO;
import com.casestudy.java.assignment.banktrasnfer.repository.AccountRepository;
import com.casestudy.java.assignment.banktrasnfer.utility.ValidationUtility;

/**
 * @author sunilkumar.havapnor
 *
 * @param <TransferBO>
 */
@Service
public class AccountServiceImpl implements Account<TransferBO> {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Autowired
	AccountRepository<AccountDomain> accountRepository;

	@Override
	public ResponseEntity<ResponseMessage> transferAmount(TransferBO trasnferObject) throws AccountNotFoundException, InSufficientAmountForTransferException {

		if (ValidationUtility.isValidAccountNumber(trasnferObject.getSoruceAccount()))
			if (ValidationUtility.isValidAccountNumber(trasnferObject.getTargetAccount()))
				if (ValidationUtility.isValidTransferAmount(trasnferObject.getTransferAmount())) {

					LOGGER.info("Validation account Details in Database");

					if (accountRepository.isExist(trasnferObject.getSoruceAccount()))
						if (accountRepository.isExist(trasnferObject.getTargetAccount())) {

						} else
							throw new AccountNotFoundException("Target accountNot Exists");
					else
						throw new AccountNotFoundException("Source account Not Exists");

					if (accountRepository.isExist(trasnferObject.getSoruceAccount())) {
						if (accountRepository.isExist(trasnferObject.getTargetAccount())) {

						}
					} else {

					}
					LOGGER.info("Get Source Account Details");
					AccountDomain sourceAccount = accountRepository
							.getAccountDetails(trasnferObject.getSoruceAccount());

					LOGGER.info("Get Target Account Details");
					AccountDomain targetAccount = accountRepository
							.getAccountDetails(trasnferObject.getTargetAccount());

					double sourceFinalAmount = sourceAccount.getAmount() - trasnferObject.getTransferAmount();
					double targetFinalAmount = targetAccount.getAmount() + trasnferObject.getTransferAmount();

					if (sourceFinalAmount < 0) {

						throw new InSufficientAmountForTransferException("Please enter valid amount to do transfer");
					} else {
						sourceAccount.setAmount(sourceFinalAmount);
						targetAccount.setAmount(targetFinalAmount);
					}

					accountRepository.saveAccountDetails(sourceAccount);
					accountRepository.saveAccountDetails(targetAccount);

					return ResponseBuilder.accepted();
				} else
					return ResponseBuilder.badRequest();
			else
				return ResponseBuilder.badRequest();
		else
			return ResponseBuilder.badRequest();

	}

}
