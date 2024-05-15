package com.sritech.ekart.service;

import com.sritech.ekart.entity.Admin;

public interface AdminService {
	
	public Admin getadminlist(String adminId);
	
	public Admin getaminId(String adminId);
	
	public void updateId(Admin admin);

}
