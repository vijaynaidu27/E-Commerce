package com.sritech.ekart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sudo_admin_user")
public class SudoAdmin {

	@Id
	@Column(name="User_Login_Id")
	private String userLoginId;
	
	@Column(name="User_password")
	private String userPassword;
	
	@Column(name="User_Role_Name")
	private String userRoleName;
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="user_contact_Mobile_Number")
	private Long userContactMobileNumber;
	
	@Column(name="user_contact_Email_Id")
	private String userContactEmailId;
	
	@Column(name="Date_created")
	private String dateCreated;
	
	@Column(name="Date_updatedDate_updated")
	private String dateUpdated;

	

	public String getUserLoginId() {
		return userLoginId;
	}



	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public String getUserRoleName() {
		return userRoleName;
	}



	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Long getUserContactMobileNumber() {
		return userContactMobileNumber;
	}



	public void setUserContactMobileNumber(Long userContactMobileNumber) {
		this.userContactMobileNumber = userContactMobileNumber;
	}



	public String getUserContactEmailId() {
		return userContactEmailId;
	}



	public void setUserContactEmailId(String userContactEmailId) {
		this.userContactEmailId = userContactEmailId;
	}



	public String getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}



	public String getDateUpdated() {
		return dateUpdated;
	}



	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}



	@Override
	public String toString() {
		return "SudoAdmin [userLoginId=" + userLoginId + ", userPassword=" + userPassword + ", userRoleName="
				+ userRoleName + ", userName=" + userName + ", userContactMobileNumber=" + userContactMobileNumber
				+ ", userContactEmailId=" + userContactEmailId + ", dateCreated=" + dateCreated + ", dateUpdated="
				+ dateUpdated + "]";
	}

	

}
