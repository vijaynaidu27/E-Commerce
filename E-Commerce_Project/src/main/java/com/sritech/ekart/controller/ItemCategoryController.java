package com.sritech.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sritech.ekart.entity.ItemCategory;
import com.sritech.ekart.service.ItemCategoryService;

@Controller
public class ItemCategoryController {
	
	@Autowired
	private ItemCategoryService itemCategoryService ;
	
	@GetMapping("/itemc")
	public ModelAndView showItemsCategoryListForm(ModelAndView model)
	{
		System.out.println("Enter into 5 controller");
		
		model.setViewName("ItemsCategoryList");
		
		List<ItemCategory> itemCategoryList = itemCategoryService.getItemCategoryList();
		
		System.out.println(itemCategoryList);
		
		model.addObject("Inventory", itemCategoryList);
		
		return model;
	}
	
	@GetMapping("/addItem")
	public ModelAndView showAddItemCategoy(ModelAndView model)
	{
		model.setViewName("AddItemCategory");
		
		return model;
	}
	
	@PostMapping("/additem")
	public String addNewItems(@RequestParam String itemc,@RequestParam String itemcsc,@RequestParam String desc)
	{
		ItemCategory itemCategory = new ItemCategory();
		
		itemCategory.setItemCategory(itemc);
		
		itemCategory.setItemCategoryShortCode(itemcsc);
		
		itemCategory.setItemCategoryDescription(desc);
		
		itemCategoryService.insertItem(itemCategory);
		
		return "redirect:/itemc";
		
	}
	
	@GetMapping("/edititem")
	public ModelAndView showEditItemCategoyForm(ModelAndView model,@RequestParam String itemCategoryId)
	{
		ItemCategory itemCategory = itemCategoryService.getItem(Integer.parseInt(itemCategoryId));
		
		model.setViewName("EditItemCategory");
		
		model.addObject("item", itemCategory);
		
		return model;
	}
	
	@PostMapping("/edititem")
	public String editItems(@RequestParam String itemId,@RequestParam String itemc,@RequestParam String itemcsc,@RequestParam String desc)
	{
		ItemCategory itemCategory = new ItemCategory();
		
		itemCategory.setItemCategoryId(Integer.parseInt(itemId));
		
		itemCategory.setItemCategory(itemc);
		
		itemCategory.setItemCategoryShortCode(itemcsc);
		
		itemCategory.setItemCategoryDescription(desc);
		
		itemCategoryService.updateItem(itemCategory);
		
		return "redirect:/itemc";
		
	}
	
	@GetMapping("/deleteitem")
	public ModelAndView showDeleteItemCategoyForm(ModelAndView model,@RequestParam String itemCategoryId)
	{
		ItemCategory itemCategory = itemCategoryService.getItem(Integer.parseInt(itemCategoryId));
		
		model.setViewName("DeleteItemCategoy");
		
		model.addObject("item", itemCategory);
		
		return model;
	}
	
	@PostMapping("/deleteitem")
	public String deleteItems(@RequestParam String itemId,@RequestParam String itemc,@RequestParam String itemcsc,@RequestParam String desc)
	{
		ItemCategory itemCategory = new ItemCategory();
		
		itemCategory.setItemCategoryId(Integer.parseInt(itemId));
		
		itemCategory.setItemCategory(itemc);
		
		itemCategory.setItemCategoryShortCode(itemcsc);
		
		itemCategory.setItemCategoryDescription(desc);
		
		itemCategoryService.deleteItem(itemCategory);
		
		return "redirect:/itemc";
		
	}
	
	@GetMapping("/itemcancel")
	public String cancle()
	{
		return "redirect:/itemc";
		
	}
	
	
}
