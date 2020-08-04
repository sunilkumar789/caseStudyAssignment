package com.casestudy.java.assignment.banktrasnfer.web.rest;

import javax.security.auth.login.AccountNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.java.assignment.banktrasnfer.config.Constants;
import com.casestudy.java.assignment.banktrasnfer.exception.InSufficientAmountForTransferException;
import com.casestudy.java.assignment.banktrasnfer.model.ResponseMessage;
import com.casestudy.java.assignment.banktrasnfer.model.TransferBO;
import com.casestudy.java.assignment.banktrasnfer.model.TrasnferVO;
import com.casestudy.java.assignment.banktrasnfer.service.Account;

/**
 * @author sunilkumar.havapnor
 *
 */
@RestController
public class BankActivitesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BankActivitesController.class);

	@Autowired
	Account<TransferBO> account;

	/**
	 * @param transferRequestObject
	 * @return
	 * @throws AccountNotFoundException
	 * @throws InSufficientAmountForTransferException
	 */
	@PostMapping(Constants.TRANSFER)
	public ResponseEntity<ResponseMessage> doTransfer(@RequestBody TrasnferVO transferRequestObject)
			throws AccountNotFoundException, InSufficientAmountForTransferException {

		LOGGER.info("Transfer Request Recieved{}", transferRequestObject);
		TransferBO transferBusinessModel = new TransferBO();
		transferBusinessModel.setSoruceAccount(Integer.valueOf(transferRequestObject.getSourceAccountNumber()));
		transferBusinessModel.setTargetAccount(Integer.valueOf(transferRequestObject.getTargetAccountNumber()));
		transferBusinessModel.setTransferAmount(Double.valueOf(transferRequestObject.getTransferAmount()));
		LOGGER.info("Transfer Request converting to businesss Object Model{}", transferBusinessModel);
		return account.transferAmount(transferBusinessModel);

	}
}
