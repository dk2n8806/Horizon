package com.horizon.entity.business;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.horizon.entity.AbstractBaseEntity;
import com.horizon.entity.status.ProductStatus;

@Entity
@Table(name="PRODUCT")
public class Product extends AbstractBaseEntity
{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private int price;
	private ProductStatus status;
	private Business business;
	private List<ProductImage> thumbnails;
	
	
	
	@OneToMany(mappedBy="product", cascade=CascadeType.ALL)
	public List<ProductImage> getThumbnails() {	return thumbnails;}
	public void setThumbnails(List<ProductImage> thumbnails) {	this.thumbnails = thumbnails;}

	
	@ManyToOne
	@JoinColumn(name="BUSINESS_ID", nullable=false)
	public Business getBusiness() {	return business;}
	public void setBusiness(Business business) {	this.business = business;}

	
	@Column(name="NAME", nullable=false)
	public String getName() {	return name;}
	public void setName(String name) {	this.name = name;}
	
	
	@Lob
	@Column(name="DESCRIPTION")
	public String getDescription() {	return description;}
	public void setDescription(String description) {	this.description = description;}
	
	@Column(name="PRICE", nullable=false)
	public int getPrice() {	return price;}
	public void setPrice(int price) {	this.price = price;}
	
	@Embedded
	@Column(name="STATUS", nullable=false)
	public ProductStatus getStatus() {	return status;}
	public void setStatus(ProductStatus status) {	this.status = status;}
	

	
	
}
