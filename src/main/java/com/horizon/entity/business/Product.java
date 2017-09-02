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
	private ProductImage image;
	private Category category;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CATEGORY_ID", nullable=false, updatable=false)
	public Category getCategory() {	return category;}
	public void setCategory(Category category) {	this.category = category;}
	
	
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
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BUSINESS_ID", nullable=false, updatable=false)
	public Business getBusiness() {	return business;}
	public void setBusiness(Business business) {	this.business = business;}
	

	@OneToMany(mappedBy="product", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	public List<ProductImage> getThumbnails() {	return thumbnails;}
	public void setThumbnails(List<ProductImage> thumbnails) {	this.thumbnails = thumbnails;}
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="IMAGE_ID", nullable=false, unique=true)
	public ProductImage getImage() {	return image;}
	public void setImage(ProductImage image) {	this.image = image;}
	

	
	
}
