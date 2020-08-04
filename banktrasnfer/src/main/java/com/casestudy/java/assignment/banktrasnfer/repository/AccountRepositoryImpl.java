
package com.casestudy.java.assignment.banktrasnfer.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.casestudy.java.assignment.banktrasnfer.domain.AccountDomain;

/**
 * @author sunilkumar.havapnor
 *
 */
@Repository
public class AccountRepositoryImpl implements AccountRepository<AccountDomain> {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 */
	@Override
	public AccountDomain getAccountDetails(Integer accountNumber) {
		return jdbcTemplate.queryForObject(DBQueries.GET_ACCOUNT_DETAILS_BY_ACCOUNTNUMBER,
				new Object[] { accountNumber }, new BeanPropertyRowMapper<AccountDomain>(AccountDomain.class));
	}

	@Override
	public int saveAccountDetails(AccountDomain accountDetails) {
		return jdbcTemplate.update(DBQueries.UPDATE_ACCOUNT_DETAILS, accountDetails.getAmount(),
				accountDetails.getAccountNumber());
	}

	@Override
	public boolean isExist(Integer accountNumber) {

		int count = 0;
		count = jdbcTemplate.queryForObject(DBQueries.IS_EXIST_BY_ACCOUNTNUMBER, new Object[] { accountNumber },
				Integer.class);
		if (count != 0)
			return true;
		else
			return false;

	}

}
