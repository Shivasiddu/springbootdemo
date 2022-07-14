package com.zensar.dto;

public class UserDto {
	
	private int userId;
	private String userName;
	private String userAddress1;
	private String userAddress2;
	private String usercity;
	
	

	public UserDto() {
		super();
	}
	public UserDto(int userId, String userName, String userAddress1, String userAddress2, String usercity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress1 = userAddress1;
		this.userAddress2 = userAddress2;
		this.usercity = usercity;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress1() {
		return userAddress1;
	}
	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}
	public String getUserAddress2() {
		return userAddress2;
	}
	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress1=" + userAddress1
				+ ", userAddress2=" + userAddress2 + ", usercity=" + usercity + "]";
	}
	
	

}

