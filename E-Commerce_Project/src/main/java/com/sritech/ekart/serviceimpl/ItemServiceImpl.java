package com.sritech.ekart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sritech.ekart.entity.Item;
import com.sritech.ekart.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private JpaRepository<Item, Integer> jpaRepository;
	
	@Override
	public List<Item> getItemList() {
		
		List<Item> item = jpaRepository.findAll();
		
		return item;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Item getItem(Integer id) {
		
		Item item = jpaRepository.getById(id);
		
		return item;
	}

	@Override
	public void insertItem(Item item) {
		
		jpaRepository.save(item);
	}

	@Override
	public void updateItem(Item item) {
		
		jpaRepository.save(item);
	}

	@Override
	public void deleteItem(Item item) {

		jpaRepository.delete(item);	
	}

}
