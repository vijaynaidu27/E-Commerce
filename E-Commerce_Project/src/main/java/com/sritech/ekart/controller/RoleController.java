package com.sritech.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.sritech.ekart.entity.SudoRole;
import com.sritech.ekart.service.RoleService;

@Controller
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/roleAdmin")
	public ModelAndView showRoleList(ModelAndView model)
	{
		System.out.println("Enter into 3 controller");
		
		List<SudoRole> list = roleService.getSudoAdminList();
		
		model.addObject("sudo",list);
		
		model.setViewName("RoleList");
		
		System.out.println("Back to 3 controller");
		
		return model;
		
	}
	
	@GetMapping("/newRole")
	public ModelAndView showAddNewAdmin(ModelAndView model)
	{
		model.setViewName("AddSudoAdminRole");
		
		return model;
	}
	
	@PostMapping("/addrole")
	public String addNewRole(@RequestParam String rolename)
	{
		
		SudoRole sudoRole = new SudoRole();
		
		sudoRole.setRoleName(rolename);
		
		roleService.insertAdmin(sudoRole);
		
		return "redirect:/roleAdmin";
		
	}
	
	@GetMapping("/editRole")
	public ModelAndView editRole(ModelAndView model,@RequestParam String loginId)
	{
		SudoRole sudoRole = roleService.getAdminById(Integer.parseInt(loginId));
		
		model.addObject("role",sudoRole);
		
		model.setViewName("SudoRoleEdit");
		
		return model;
		
	}
	
	@PostMapping("/updateRole")
	public String editAdmin(@RequestParam String RoleId,@RequestParam String roleName)
	{
		
        SudoRole sudoRole = new SudoRole();
		
        sudoRole.setRoleId(Integer.parseInt(RoleId));
        
		sudoRole.setRoleName(roleName);
		
		roleService.updateAdmin(sudoRole);
		
		return "redirect:/roleAdmin";
		
	}
	
	@GetMapping("/deleteAdminRole")
	public ModelAndView showDeleteAdminForm(ModelAndView model,@RequestParam String loginId)
	{
		SudoRole sudoRole = roleService.getAdminById(Integer.parseInt(loginId));
		
		model.addObject("role",sudoRole);
		
		model.setViewName("SudoRoleDelete");
		
		return model;
	}
	
	@PostMapping("/deleteRole")
	public String deleteRole(@RequestParam String RoleId,@RequestParam String roleName)
	{
		
        SudoRole sudoRole = new SudoRole();
		
        sudoRole.setRoleId(Integer.parseInt(RoleId));
        
		sudoRole.setRoleName(roleName);
		
		roleService.deleteAdminById(sudoRole);
		
		return "redirect:/roleAdmin";
		
	}
	
	@GetMapping("/cc")
	public String cancleButton()
	{
		return "redirect:/roleAdmin";
	}

}
