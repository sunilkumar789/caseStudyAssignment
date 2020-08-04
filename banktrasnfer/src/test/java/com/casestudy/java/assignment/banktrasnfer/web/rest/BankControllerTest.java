
package com.casestudy.java.assignment.banktrasnfer.web.rest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.casestudy.java.assignment.banktrasnfer.model.TransferBO;
import com.casestudy.java.assignment.banktrasnfer.model.TrasnferVO;
import com.casestudy.java.assignment.banktrasnfer.service.Account;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest

@AutoConfigureMockMvc

public class BankControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	Account<TransferBO> account;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.post("/banktransfer")
				.content(asJsonString(new TrasnferVO("123456", "456789", "100.00")))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
