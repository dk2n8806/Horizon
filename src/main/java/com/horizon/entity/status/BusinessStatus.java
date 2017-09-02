package com.horizon.entity.status;

public enum BusinessStatus {

	ACTIVE("active", "business is active")
	,
	DEACTIVE("deactive", "business is deactive")
	,
	DELETED_BY_ACCOUNT("deleted", "business is deleted")
	,
	DELETED_BY_ADMIN("deleted", "business is deleted by admin")
	,
	SUSPENDED_BY_ADMIN("suspended", "business is suspended by admin")
	;
	
	private String info;
	private String friendlyInfo;
	
	private BusinessStatus(String info, String friendlyInfo) {
		this.info = info;
		this.friendlyInfo = friendlyInfo;
	}
	
	public String getFriendlyInfo() {
		return friendlyInfo;
	}
	public String getInfo() {
		return info;
	}
}
