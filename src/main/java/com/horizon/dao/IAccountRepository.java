package com.horizon.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.horizon.entity.Account;

public interface IAccountRepository extends CrudRepository<Account, UUID>{

	
}
