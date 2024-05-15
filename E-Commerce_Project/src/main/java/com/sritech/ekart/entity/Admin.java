package com.sritech.ekart.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="root_admin_user")
public class Admin {
	
	@Id
	@Column(name="Admin_LOGIN_ID")
	private String loginId;
	
	@Column(name="Admin_PASSWORD")
	private String adminPassword;
	
	@Column(name="Admin_NAME")
	private String adminName;
	
	@Column(name="Admin_MOBILE_NUM1")
	private Long adminMobileNum1;
	
	@Column(name="Admin_MOBILE_NUM2")
	private Long adminMobileNum2;
	
	@Column(name="DATE_CREATED")
	private Date dateCreated;
	
	@Column(name="DATE_UPDATED")
	private Date dateUpdated;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public Long getAdminMobileNum1() {
		return adminMobileNum1;
	}

	public void setAdminMobileNum1(Long adminMobileNum1) {
		this.adminMobileNum1 = adminMobileNum1;
	}

	public Long getAdminMobileNum2() {
		return adminMobileNum2;
	}

	public void setAdminMobileNum2(Long adminMobileNum2) {
		this.adminMobileNum2 = adminMobileNum2;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	
}
