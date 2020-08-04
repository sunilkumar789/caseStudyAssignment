package com.casestudy.java.assignment.banktrasnfer.web.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.casestudy.java.assignment.banktrasnfer.model.TransferBO;
import com.casestudy.java.assignment.banktrasnfer.service.Account;

@SpringBootTest
class BankActivitesControllerSmokeTest {
	
	@Autowired
	private BankActivitesController controller;
	

	@MockBean
	Account<TransferBO> account;
	
	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}


