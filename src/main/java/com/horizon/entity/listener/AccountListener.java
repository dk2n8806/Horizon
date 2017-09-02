package com.horizon.entity.listener;

import javax.persistence.PrePersist;

import com.horizon.entity.Account;
import com.horizon.entity.status.AccountStatus;

public class AccountListener {

	@PrePersist
	public void preperist(Account account) 
	{
		account.setStatus(AccountStatus.DEACTIVE);
	}
}
