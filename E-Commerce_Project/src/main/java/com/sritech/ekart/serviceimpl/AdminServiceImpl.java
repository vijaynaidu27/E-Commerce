package com.sritech.ekart.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sritech.ekart.entity.Admin;
import com.sritech.ekart.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private JpaRepository<Admin, String> jpaRepository;

	@Override
	public Admin getadminlist(String adminId) {
		
		System.out.println("Enter into serviceImpl");
		
		Admin admin = jpaRepository.getById(adminId);
		
		return admin;
	}

	@Override
	public Admin getaminId(String adminId) {

        System.out.println("Enter into serviceImpl");
		
		Admin admin = jpaRepository.getById(adminId);
		
		System.out.println(admin);
		
		return admin;
	}

	@Override
	public void updateId(Admin admin) {
 
       System.out.println("UpdatedById");
		
	   jpaRepository.save(admin);
		
	  System.out.println("back to service layer");
		
	}
}
