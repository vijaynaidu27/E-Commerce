package com.sritech.ekart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sritech.ekart.entity.SudoAdmin;
import com.sritech.ekart.service.SudeoAdminService;

@Service
public class SudoAdminServiceImpl implements SudeoAdminService {

	@Autowired
	private JpaRepository<SudoAdmin, String> jpaRepository;
	
	@Override
	public List<SudoAdmin> getSudoAdminList() {
		
		System.out.println("Enter into 2 service impl");
		
		List<SudoAdmin> list = jpaRepository.findAll();
		
		System.out.println(list);
		
		System.out.println("Return the 2 controller	");
		
		return list;
		
	}

	
	@Override
	public void insertAdmin(SudoAdmin sudoAdmin) {
		
		jpaRepository.save(sudoAdmin);
		
	}

	@Override
	public void updateAdmin(SudoAdmin sudoAdmin) {

		jpaRepository.save(sudoAdmin);
		
	}

	@Override
	public void deleteAdminById(SudoAdmin admin) {
		
		jpaRepository.delete(admin);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public SudoAdmin getAdminById(String uid) {

		SudoAdmin admin = jpaRepository.getById(uid);
		
		return admin;
	}

}
