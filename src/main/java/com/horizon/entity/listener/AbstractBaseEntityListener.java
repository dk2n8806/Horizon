package com.horizon.entity.listener;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.horizon.entity.AbstractBaseEntity;

public class AbstractBaseEntityListener {
	
	
	@PrePersist
	public void userPrePersist(AbstractBaseEntity enitty) {
		enitty.setCreatedOn(LocalDateTime.now());
		enitty.setModifiedOn(LocalDateTime.now());
	}
	
	@PreUpdate
	public void preUpdate(AbstractBaseEntity entity) {
		entity.setModifiedOn(LocalDateTime.now());
	}
}
