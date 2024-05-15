package com.sritech.ekart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sritech.ekart.entity.ItemCategory;
import com.sritech.ekart.service.ItemCategoryService;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService  {

	@Autowired
	private JpaRepository<ItemCategory, Integer> jpaRepository;

	@Override
	public List<ItemCategory> getItemCategoryList() {
		
		List<ItemCategory> list = jpaRepository.findAll();
		
		return list;
	}

	@SuppressWarnings("deprecation")
	@Override
	public ItemCategory getItem(Integer id) {
		
		ItemCategory itemCategory = jpaRepository.getById(id);
		
		return itemCategory;
	}

	@Override
	public void insertItem(ItemCategory itemCategory) {
	
		jpaRepository.save(itemCategory);
		
	}

	@Override
	public void updateItem(ItemCategory itemCategory) {
		
		jpaRepository.save(itemCategory);
		
	}

	@Override
	public void deleteItem(ItemCategory itemCategory) {
		
		jpaRepository.delete(itemCategory);
		
	}
	
	

}
