package com.sritech.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sritech.ekart.entity.SudoRole;

@Repository
public interface RoleRepository extends JpaRepository<SudoRole, Integer> {

}
