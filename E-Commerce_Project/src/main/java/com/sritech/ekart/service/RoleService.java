package com.sritech.ekart.service;

import java.util.List;

import com.sritech.ekart.entity.SudoRole;

public interface RoleService {

    public List<SudoRole> getSudoAdminList();
	
	public SudoRole getAdminById(Integer userid);
	
	public void insertAdmin(SudoRole sudoRole);
	
	public void updateAdmin(SudoRole sudoRole);
	
	public void deleteAdminById(SudoRole sudoRole );

	

	
}
