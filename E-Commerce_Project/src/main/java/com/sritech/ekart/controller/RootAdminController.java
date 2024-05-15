package com.sritech.ekart.controller;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sritech.ekart.entity.Admin;
import com.sritech.ekart.service.AdminService;

@Controller
public class RootAdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/adminpanel")
	public ModelAndView ShowAdminPanel()
	{
		
		adminService.getadminlist("Hello");
		
	    System.out.println("retrun to the controller");
		
		ModelAndView model = new ModelAndView();
	
		model.setViewName("adminpanel");
		
		return model;
	}
	
	@GetMapping("/login")
	public ModelAndView showLoginForm()
	{
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("login");
		
		return model;
	}
	
	@PostMapping("/save")
	public String adminlogin(@RequestParam String adminId,@RequestParam String pwd)
	{
		ModelAndView view = null ;
		try
		{

		System.out.println(adminId);
		
		System.out.println(pwd);
		
		  view = new ModelAndView() ;
		 
		Admin admin=adminService.getadminlist( adminId );
		
		System.out.println("back to controller");
		
		if(adminId !=null && adminId.equalsIgnoreCase(admin.getLoginId()) && pwd.equals(admin.getAdminPassword()))
			
		{ 
			
	           return "redirect:/sudoadmin?name="+admin.getAdminName();
		}
		 
		else
		{
			     view.setViewName("login"); 
			     
			     view.addObject("message", "Invalid UserName Or Password");
		}
	}
		catch(EntityNotFoundException ex)
		{
			view.setViewName("login");
			 
		    view.addObject("message", "Invalid UserName");
			
		}
	catch(Exception e){
			
		view.setViewName("login");
		 
	    view.addObject("message", "Invalid UserName");
		 
		e.printStackTrace();
		}
		return "redirect:/login";	
	}
	
	@GetMapping("/reset")
	public ModelAndView showResetPasswordForm()
	{
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("resetpassword");
		
		return model;
	}
	
	@PostMapping("/update")
	public ModelAndView adminUpdate(@RequestParam String adminId,@RequestParam String oldPassword,@RequestParam String newPassword)
	{
		
		ModelAndView view = new ModelAndView();
		
		System.out.println(adminId);
		System.out.println(oldPassword);
		System.out.println(newPassword);
		
		Admin admin = adminService.getaminId(adminId);
		
		if(admin !=null && oldPassword.equals(admin.getAdminPassword()))
		{
			admin.setAdminPassword(newPassword);
			
			adminService.updateId(admin);
			
			view.setViewName("adminpanel");
			
			System.out.println("back to controller");
		}
		else
		{
			view.setViewName("resetpassword");
		}
		
		return view;
		
	}
	
	@GetMapping("/forget")
	public ModelAndView showForgotPasswordForm()
	{
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("forgetpassword");
		
		return model;
	}
	
	private String adminUserId;
	
	@PostMapping("/forgetpass")
	public ModelAndView adminForget(@RequestParam String adminId, @RequestParam String number)
	{
		
		adminUserId= adminId;
		
		ModelAndView view = null;
		
		System.out.println(adminId);
		
		System.out.println(number);
		
		try
		{
			view = new ModelAndView();
			
			Admin admin = adminService.getadminlist( adminId );
			
			if(admin !=null && adminId.equalsIgnoreCase(admin.getLoginId()) && Long.parseLong(number) == admin.getAdminMobileNum1())
			{
				view.setViewName("change");
			}
			else
			{
				view.setViewName("forgetpassword");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return view;
		
	}
	  
	@PostMapping("/change")
	public ModelAndView adminChange(@RequestParam String newPassword)
	{
		
		ModelAndView view = new ModelAndView();
		
		try
		{
		System.out.println(newPassword);
		
		Admin admin = adminService.getadminlist(adminUserId);
		
			admin.setAdminPassword(newPassword);
			
			adminService.updateId(admin);
			
			view.setViewName("adminpanel");
			
			System.out.println("back to controller");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return view;
	}
}
	
	
	
