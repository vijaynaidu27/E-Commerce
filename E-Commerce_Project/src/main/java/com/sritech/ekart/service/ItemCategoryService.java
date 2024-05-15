package com.sritech.ekart.service;

import java.util.List;


import com.sritech.ekart.entity.ItemCategory;

        public interface ItemCategoryService {
	
	    public List<ItemCategory> getItemCategoryList();
		
		public  ItemCategory getItem(Integer id);
		
		public void insertItem(ItemCategory itemCategory);
		
		public void updateItem(ItemCategory itemCategory);
		
		public void deleteItem(ItemCategory itemCategory );

}
