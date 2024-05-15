package com.sritech.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sritech.ekart.entity.SudoAdmin;

@Repository
public interface SudoAdminRepository extends JpaRepository<SudoAdmin, String>{

}
