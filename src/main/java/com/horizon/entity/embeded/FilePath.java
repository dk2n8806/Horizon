package com.horizon.entity.embeded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FilePath {

	private String path;
	
	@Column(name="PATH", nullable=false, updatable=false)
	public String getPath() {	return path;}
	public void setPath(String path) {	this.path = path;}
	
	
}
