package com.sritech.ekart.service;

import java.util.List;

import com.sritech.ekart.entity.SudoAdmin;

public interface SudeoAdminService {
	
	public List<SudoAdmin> getSudoAdminList();
	
	public SudoAdmin getAdminById(String uid);
	
	public void insertAdmin(SudoAdmin sudoAdmin);
	
	public void updateAdmin(SudoAdmin sudoAdmin);
	
	public void deleteAdminById(SudoAdmin admin );


}
