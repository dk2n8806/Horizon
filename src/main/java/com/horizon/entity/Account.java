package com.horizon.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.horizon.entity.listener.AbstractBaseEntityListener;
import com.horizon.entity.listener.AccountListener;
import com.horizon.entity.status.AccountStatus;

@Entity
@EntityListeners({AbstractBaseEntityListener.class, AccountListener.class})
@Table(name="ACCOUNT")
public class Account extends AbstractBaseEntity
{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String email;
	private byte[] password;
	private AccountStatus status;
	
	public Account() {super();}
	
	public Account(String username, String email, byte[] password) {
		this();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	
	@Column(name="USERNAME", nullable=false)
	public String getUsername() {	return username;}
	public void setUsername(String username) {	this.username = username;}
	
	
	@Column(name="EMAIL", nullable=false, unique=true)
	public String getEmail() {	return email;}
	public void setEmail(String email) {this.email = email;}
	
	
	@Column(name="PASSWORD", nullable=false)
	public byte[] getPassword() {	return password;}
	public void setPassword(byte[] password) {this.password = password;}
	
	@Enumerated(EnumType.STRING)
	@Column(name="STATUS", nullable=false)
	public AccountStatus getStatus() {	return status;}
	public void setStatus(AccountStatus status) {this.status = status;}

	
	
}
