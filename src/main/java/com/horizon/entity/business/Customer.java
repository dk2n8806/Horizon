package com.horizon.entity.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.horizon.entity.AbstractBaseEntity;
import com.horizon.entity.Account;
import com.horizon.entity.status.CustomerStatus;

@Entity
@Table(name="CUSTOMER")
public class Customer extends AbstractBaseEntity 
{

	private static final long serialVersionUID = 1L;
	private Account account;
	private Business business;
	private CustomerStatus status;
	
	@ManyToOne
	@JoinColumn(name="ACCOUNT_ID", nullable=false, updatable=false)
	public Account getAccount() {	return account;}
	public void setAccount(Account account) {	this.account = account;}

	@ManyToOne
	@JoinColumn(name="BUSINESS_ID", nullable=false, updatable=false)
	public Business getBusiness() {	return business;}
	public void setBusiness(Business business) {	this.business = business;}
	
	@Enumerated(EnumType.STRING)
	@Column(name="STATUS", nullable=false)
	public CustomerStatus getStatus() {	return status;}
	public void setStatus(CustomerStatus status) {	this.status = status;}
	
	
	
}
