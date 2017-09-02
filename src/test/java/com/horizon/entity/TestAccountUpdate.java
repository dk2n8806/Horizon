package com.horizon.entity;

import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.BaseTestRunner;
import com.horizon.dao.IAccountRepository;

public class TestAccountUpdate extends BaseTestRunner 
{

	@Autowired private IAccountRepository accountRepository;
	
	@Test
	public void test() {
		
		Account entity = accountRepository.findOne(UUID.fromString("1"));
		entity.setUsername("omg");
		accountRepository.save(entity);
		
		
	}
}
