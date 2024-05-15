package com.sritech.ekart.service;

import java.util.List;

import com.sritech.ekart.entity.Item;

public interface ItemService {

	    public List<Item> getItemList();
		
		public  Item getItem(Integer id);
		
		public void insertItem(Item item);
		
		public void updateItem(Item item);
		
		public void deleteItem(Item item );
}
