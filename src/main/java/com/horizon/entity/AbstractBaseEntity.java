package com.horizon.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable
{

	private static final long serialVersionUID = 1L;

	private long id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {return id;}
	public void setId(long id) {	this.id = id;}
}
