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
import com.horizon.entity.status.BusinessStatus;

@Entity
@Table(name="BUSINESS")
public class Business extends AbstractBaseEntity
{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private BusinessStatus status;
	private Account account;
	
	
	@ManyToOne
	@JoinColumn(name="ACCOUNT_ID", nullable=false, unique=true, updatable=false)
	public Account getAccount() {	return account;}
	public void setAccount(Account account) {	this.account = account;}
	
	
	@Column(name="NAME", nullable=false)
	public String getName() {return name;}
	public void setName(String name) {	this.name = name;}
	
	@Enumerated(EnumType.STRING)
	@Column(name="STASTUS", nullable=false)
	public BusinessStatus getStatus() {	return status;}
	public void setStatus(BusinessStatus status) {	this.status = status;}
	
	
}
