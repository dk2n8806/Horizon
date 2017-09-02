package com.horizon.entity.status;

public enum AccountStatus {

		ACTIVE("active", "account is active")
		,
		DEACTIVE("deactive", "account is deactive")
		,
		DELETED_BY_ACCOUNT_OWNER("deleted", "account is deleted")
		,
		DELETED_BY_ADMIN("deleted", "account is deleted by admin")
		,
		SUSPENDED_BY_ADMIN("suspended", "account is suspended by admin")
		;
		
		private String info;
		private String friendlyInfo;
		
		private AccountStatus(String info, String friendlyInfo) {
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
