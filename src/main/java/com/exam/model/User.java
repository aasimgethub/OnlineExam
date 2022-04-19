package com.exam.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="user_details_trials")
public class User {
	//@Id
	
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String uniqueId;
	@Column(unique = true)
	private String userEmail;
	
	@Column(name = "userId", length = 200, unique = true)
	private String userId;
	
	@Column(name = "userName", length = 200, unique = true)
	private String userName;
	
	private String password;
	private String uFirstName;
	private String uLastName;
	private String userAddress;
	private Long phone;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getuFirstName() {
		return uFirstName;
	}
	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}
	public String getuLastName() {
		return uLastName;
	}
	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	@Override
	public String toString() {
		return "User [UserId=" + userId + ", userName=" + userName + ", password=" + password + ", uFirstName="
				+ uFirstName + ", uLastName=" + uLastName + ", userEmail=" + userEmail + ", userAddress=" + userAddress
				+ ", phone=" + phone + "]";
	}
	
	

}
