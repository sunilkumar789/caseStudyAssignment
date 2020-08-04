package com.casestudy.java.assignment.banktrasnfer.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.casestudy.java.assignment.banktrasnfer.config.Constants;

/**
 * @author sunilkumar.havapnor
 *
 */
public class ResponseBuilder {

	private ResponseBuilder() {

	}

	/**
	 * @return
	 */
	public static ResponseEntity<ResponseMessage> badRequest() {
		ResponseMessage res = new ResponseMessage();
		res.setStatusCode(Constants.BAD_REQUEST_CODE);
		res.setStatusMessage(Constants.BAD_REQUEST_MESSAGE);
		return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
	}

	/**
	 * @return
	 */
	public static ResponseEntity<ResponseMessage> accepted() {
		ResponseMessage res = new ResponseMessage();
		res.setStatusCode(Constants.REQUEST_ACCEPTED_CODE);
		res.setStatusMessage(Constants.REQUEST_ACCEPTED_CODE_MESSAGE);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
