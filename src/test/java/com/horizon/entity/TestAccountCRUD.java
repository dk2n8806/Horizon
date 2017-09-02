package com.horizon.entity;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.BaseTestRunner;
import com.horizon.dao.IAccountRepository;

public class TestAccountCRUD extends BaseTestRunner {

	@Autowired private IAccountRepository accountRepository;
	
	@Test
	public void test() {
		System.out.println(accountRepository.count());
	}
}
