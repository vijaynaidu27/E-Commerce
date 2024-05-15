package com.sritech.ekart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sritech.ekart.entity.SudoRole;
import com.sritech.ekart.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private JpaRepository<SudoRole, Integer> jpaRepository;
	
	@Override
	public List<SudoRole> getSudoAdminList() {
		
		List<SudoRole> list = jpaRepository.findAll();
		
		return list;
	}

	@Override
	public void insertAdmin(SudoRole sudoRole) {
		
		jpaRepository.save(sudoRole);
	}

	@Override
	public void updateAdmin(SudoRole sudoRole) {
		
		jpaRepository.save(sudoRole);
	}

	@Override
	public void deleteAdminById(SudoRole sudoRole) {
		
		jpaRepository.delete(sudoRole);
		
	}

	
	@Override
	public SudoRole getAdminById(Integer userid) {

		SudoRole sudoRole = jpaRepository.getById(userid);

		return sudoRole;
	}

	

	

}
