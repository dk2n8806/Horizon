package com.horizon.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.BaseTestRunner;
import com.horizon.dao.IAccountRepository;
import com.horizon.entity.status.AccountStatus;

public class TestAccountCRUD extends BaseTestRunner {

	@Autowired private IAccountRepository accountRepository;
	
	@Test
	public void test() {
		long count_v2 = 0;
		long count_v1 =  0;
		
		count_v1 = accountRepository.count();
		String username = "username";
		String email = "email" + LocalDateTime.now().getNano();
		byte[] password = "password".getBytes();
		Account account = new Account(username, email, password);
		Account entity = accountRepository.save(account);
		
		assertNotNull(entity);
		assertEquals(entity.getStatus(), AccountStatus.ACTIVE);
		count_v2 = accountRepository.count();
		
		assertEquals(count_v1 + 1, count_v2);
	}
}
