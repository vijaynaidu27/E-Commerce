package com.sritech.ekart.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sudo_admin_role")
public class SudoRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ROLE_ID")
	private Integer roleId;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="Date_created")
	private Date dateCreated;
	
	@Column(name="Date_updated")
	private Date dateUpdated;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	@Override
	public String toString() {
		return "SudoRole [roleId=" + roleId + ", roleName=" + roleName + ", dateCreated=" + dateCreated
				+ ", dateUpdated=" + dateUpdated + "]";
	}

	
}
