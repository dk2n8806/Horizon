package com.horizon.entity.business;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.horizon.entity.AbstractBaseEntity;
import com.horizon.entity.embeded.FilePath;

@Entity
@Table(name="PRODUCT_IMAGE")
public class ProductImage  extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;
	private FilePath imagePath;
	private boolean isActive;
	private Product product;
	
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID", nullable=false, updatable=false)
	public Product getProduct() {	return product;}
	public void setProduct(Product product) {	this.product = product;}
	
	@Embedded
	public FilePath getImagePath() {	return imagePath;}
	public void setImagePath(FilePath imagePath) {	this.imagePath = imagePath;}
	

	@Type(type="yes_no" )
	@Column(name="IS_ACTIVE", nullable=false)
	public boolean isActive() {	return isActive;}
	public void setActive(boolean isActive) {		this.isActive = isActive;}
	
	
}
