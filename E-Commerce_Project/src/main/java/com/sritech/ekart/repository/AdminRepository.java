package com.sritech.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sritech.ekart.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
	
	
}
