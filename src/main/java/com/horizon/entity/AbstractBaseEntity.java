package com.horizon.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable
{

	private static final long serialVersionUID = 1L;

	private UUID id;
	private long version;
	private LocalDateTime createdOn;
	private LocalDateTime modifiedOn;
	
	
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
	public UUID getId() {return id;}
	public void setId(UUID id) {	this.id = id;}
	
	@Version
	@Column(name="VERSION")
	public long getVersion() {	return version;}
	public void setVersion(long version) {	this.version = version;}
	
	@CreatedDate
	@Column(name="CREATED_ON", nullable=false, updatable=false)
	public LocalDateTime getCreatedOn() {	return createdOn;}
	public void setCreatedOn(LocalDateTime createdOn) {	this.createdOn = createdOn;}
	
	@LastModifiedDate
	@Column(name="MODIFIED_ON", nullable=false)
	public LocalDateTime getModifiedOn() {	return modifiedOn;}
	public void setModifiedOn(LocalDateTime modifiedOn) {	this.modifiedOn = modifiedOn;}
	
}
