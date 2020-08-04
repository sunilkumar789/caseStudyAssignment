package com.casestudy.java.assignment.banktrasnfer.exception;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author sunilkumar.havapnor
 *
 */
@ControllerAdvice
public class ExceptionsHandler {

	private final MessageSource messageSource;

	/**
	 * @param messageSource
	 */
	@Autowired
	public ExceptionsHandler(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/**
	 * @param ex
	 * @param locale
	 * @return
	 */
	@ExceptionHandler(RestException.class)
	public ResponseEntity<RestMessage> handleIllegalArgument(RestException ex, Locale locale) {
		String errorMessage = messageSource.getMessage(ex.getMessage(), ex.getArgs(), locale);
		return new ResponseEntity<>(new RestMessage(errorMessage), HttpStatus.BAD_REQUEST);
	}

	/**
	 * @param ex
	 * @param locale
	 * @return
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<RestMessage> handleArgumentNotValidException(MethodArgumentNotValidException ex,
			Locale locale) {
		BindingResult result = ex.getBindingResult();
		List<String> errorMessages = result.getAllErrors().stream()
				.map(objectError -> messageSource.getMessage(objectError, locale)).collect(Collectors.toList());
		return new ResponseEntity<>(new RestMessage(errorMessages), HttpStatus.BAD_REQUEST);
	}

	/**
	 * @return
	 */
	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<String> accountNotFoundException() {
		return new ResponseEntity<>("Account Details are Incorrect", HttpStatus.BAD_REQUEST);
	}

	/**
	 * @return
	 */
	@ExceptionHandler(InSufficientAmountForTransferException.class)
	public ResponseEntity<String> inSufficientAmountForTransferException() {
		return new ResponseEntity<>("Please enter sufficient amount to do transfer", HttpStatus.BAD_REQUEST);
	}
}
