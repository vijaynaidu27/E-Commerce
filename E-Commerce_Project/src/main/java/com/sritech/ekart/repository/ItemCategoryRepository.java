package com.sritech.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sritech.ekart.entity.ItemCategory;

@Repository
public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Integer>{

}
