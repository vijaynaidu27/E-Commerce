package com.sritech.ekart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sritech.ekart.entity.SudoAdmin;
import com.sritech.ekart.service.SudeoAdminService;

@Controller
public class DashboardController {

	@Autowired
	private SudeoAdminService sudeoAdminService;
	
	@GetMapping("/DashboardLogin")
	public ModelAndView showDashboardLoginForm(ModelAndView model)
	{
		System.out.println("Enter Into 4 Controller");
		
		model.setViewName("DashboardLogin");
		
		return model;
	}
	
	private String id;
	
	@PostMapping("/SudoAdmin")
	public ModelAndView sudoAdminDashboard(ModelAndView model,@RequestParam String adminId,@RequestParam String pwd)
	{
		id = adminId;
		
		SudoAdmin admin = sudeoAdminService.getAdminById(adminId);
		
		if(adminId !=null && adminId.equalsIgnoreCase(admin.getUserLoginId()) && pwd.equals(admin.getUserPassword()))
		{
			model.setViewName(admin.getUserRoleName());
		}
		else
		{
			model.setViewName("DashboardLogin");
		}
		return model;
		
	}	
	
	@GetMapping("/return")
	public ModelAndView logOut(ModelAndView model){
		
		SudoAdmin admin = sudeoAdminService.getAdminById(id);
		
		System.out.println(admin);
		
		if(id.equalsIgnoreCase(admin.getUserLoginId()))
		{
			model.setViewName(admin.getUserRoleName());
		}
		
		return model;
	}
}
