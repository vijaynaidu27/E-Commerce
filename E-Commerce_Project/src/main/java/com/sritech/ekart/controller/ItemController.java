package com.sritech.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sritech.ekart.entity.Item;
import com.sritech.ekart.entity.ItemCategory;
import com.sritech.ekart.service.ItemCategoryService;
import com.sritech.ekart.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemservice; 
	
	@Autowired
	private ItemCategoryService itemCategoryService;
	
	@GetMapping("/item")
	public ModelAndView showItemList(ModelAndView model)
	{
		System.out.println("Enter into 6 contoller");
		
		List<Item> itemList = itemservice.getItemList();
		
		model.addObject("Inventory", itemList);
		
		model.setViewName("ItemList");
		
		return model;
	}
	
	@GetMapping("/add")
	public ModelAndView showAddItem(ModelAndView model)
	{
		List<ItemCategory> itemCategoryList = itemCategoryService.getItemCategoryList();
		
		model.addObject("ItemCategory", itemCategoryList);
		
		model.setViewName("AddItem");
		
		return model;
	}
	
	@PostMapping("/add")
	public String addNewItem(@RequestParam String itemn,@RequestParam String itemsc,@RequestParam String itemCategory,@RequestParam String desc,@RequestParam String itemop,@RequestParam String itemp,@RequestParam String items)
	{
		Item item = new Item();
		
		item.setItemName(itemn);
		
		item.setItemShortCode(itemsc);
		
		item.setItemCategory(itemCategory);
		
		item.setItemDescription(desc);
		
		item.setItemOldPrice(Float.parseFloat(itemop));
		
		item.setItemPrice(Float.parseFloat(itemp));
		
		item.setItemStatus(items);
		
		itemservice.insertItem(item);
		
		return "redirect:/item";
		
	}
	
	@GetMapping("/edit")
	public ModelAndView showEditItemForm(ModelAndView model,@RequestParam String itemId)
	{
		Item item = itemservice.getItem(Integer.parseInt(itemId));
		
		model.addObject("item", item);
		
		List<ItemCategory> itemCategoryList = itemCategoryService.getItemCategoryList();
		
		model.addObject("ItemCategory", itemCategoryList);
		
		model.setViewName("EditItem");
		
		return model;
		
	}
	
	@PostMapping("/edit")
	public String editItem(@RequestParam String itemId,@RequestParam String itemn,@RequestParam String itemsc,@RequestParam String itemCategory,@RequestParam String desc,@RequestParam String itemop,@RequestParam String itemp,@RequestParam String items)
	{
		Item item = new Item();
		
		item.setItemId(Integer.parseInt(itemId));
		
		item.setItemName(itemn);
		
		item.setItemShortCode(itemsc);
		
		item.setItemCategory(itemCategory);
		
		item.setItemDescription(desc);
		
		item.setItemOldPrice(Float.parseFloat(itemop));
		
		item.setItemPrice(Float.parseFloat(itemp));
		
		item.setItemStatus(items);
		
		itemservice.updateItem(item);
		
		return "redirect:/item";
		
	}
	
	@GetMapping("/deleteIt")
	public ModelAndView showDeleteItemForm(ModelAndView model,@RequestParam String itemId)
	{
        Item item = itemservice.getItem(Integer.parseInt(itemId));
		
		model.addObject("item", item);
		
		List<ItemCategory> itemCategoryList = itemCategoryService.getItemCategoryList();
		
		model.addObject("ItemCategory", itemCategoryList);
		
		model.setViewName("DeleteItem");
		
		return model;
		
	}
	
	@PostMapping("/deleteIt")
	public String deleteItem(@RequestParam String itemId,@RequestParam String itemn,@RequestParam String itemsc,@RequestParam String itemCategory,@RequestParam String desc,@RequestParam String itemop,@RequestParam String itemp,@RequestParam String items)
	{
		Item item = new Item();
		
		item.setItemId(Integer.parseInt(itemId));
		
		item.setItemName(itemn);
		
		item.setItemShortCode(itemsc);
		
		item.setItemCategory(itemCategory);
		
		item.setItemDescription(desc);
		
		item.setItemOldPrice(Float.parseFloat(itemop));
		
		item.setItemPrice(Float.parseFloat(itemp));
		
		item.setItemStatus(items);
		
		itemservice.deleteItem(item);
		
		return "redirect:/item";
		
	}

}
