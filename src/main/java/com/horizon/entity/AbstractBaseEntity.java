package com.horizon.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable
{

	private static final long serialVersionUID = 1L;

	private long id;
	private long version;
	private LocalDateTime createdOn;
	private LocalDateTime modifiedOn;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {return id;}
	public void setId(long id) {	this.id = id;}
	
	@Version
	@Column(name="VERSION")
	public long getVersion() {	return version;}
	public void setVersion(long version) {	this.version = version;}
	
	
	@Column(name="CREATED_ON")
	public LocalDateTime getCreatedOn() {	return createdOn;}
	public void setCreatedOn(LocalDateTime createdOn) {	this.createdOn = createdOn;}
	
	
	@Column(name="MODIFIED_ON")
	public LocalDateTime getModifiedOn() {	return modifiedOn;}
	public void setModifiedOn(LocalDateTime modifiedOn) {	this.modifiedOn = modifiedOn;}
	
}
