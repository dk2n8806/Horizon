package com.horizon.entity.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.horizon.entity.AbstractBaseEntity;

@Entity
@Table(name = "CATEGORY")
public class Category extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	private String name;					// name of the category
	private Business business;			// created by business
	private boolean isActive;				// status of the category
	
	@Column(name="NAME", nullable=false)
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	@ManyToOne
	@JoinColumn(name="BUSINESS_ID", nullable=false, updatable=false)
	public Business getBusiness() {	return business;}
	public void setBusiness(Business business) {this.business = business;}
	
	@Type(type="yes_no" )
	@Column(name="IS_ACTIVE", nullable=false)
	public boolean isActive() {	return isActive;}
	public void setActive(boolean isActive) {		this.isActive = isActive;}
	
	
}
