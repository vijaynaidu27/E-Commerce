package com.sritech.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sritech.ekart.entity.SudoAdmin;
import com.sritech.ekart.entity.SudoRole;
import com.sritech.ekart.service.RoleService;
import com.sritech.ekart.service.SudeoAdminService;

@Controller
public class SudoAdminController {

	@Autowired
	private SudeoAdminService sudeoAdminService;
	
	@Autowired
	private RoleService roleService;
	
	private String rootName;
	
	@GetMapping("/sudoadmin")
	public ModelAndView showSudoAdimListList(@RequestParam String name)
	{ 
		System.out.println("Enter into 2 controller");
		
		rootName = name;
		
		List<SudoAdmin> adminList = sudeoAdminService.getSudoAdminList();
		
		ModelAndView model = new ModelAndView();
		
		model.addObject("sudoAdminList", adminList);
		
		model.setViewName("sudoadminlist");
		
		model.addObject("name",name);
		
		System.out.println(name);
		
		System.out.println("Back to 2 controller");
		
		return model;
	}
	
	@GetMapping("/newuser")
	public ModelAndView showAddNewAdmin(ModelAndView model)
	{
		List<SudoRole> list = roleService.getSudoAdminList();
		
		model.addObject("roleList",list);
		
		model.setViewName("addnewadmin");
		
		return model;
	}
	
	@PostMapping("/insert")
	public String addNewAdmin(@RequestParam String id, @RequestParam String pass,@RequestParam String roleName,@RequestParam String name,@RequestParam String mobilenum,@RequestParam String emailid)
	{
		
		SudoAdmin sudoAdmin = new SudoAdmin();
		
		sudoAdmin.setUserLoginId(id);
		
		sudoAdmin.setUserPassword(pass);
		
		sudoAdmin.setUserRoleName(roleName);
		
		sudoAdmin.setUserName(name);
		
		sudoAdmin.setUserContactMobileNumber(Long.parseLong(mobilenum));
		
		sudoAdmin.setUserContactEmailId(emailid);
		
		sudeoAdminService.insertAdmin(sudoAdmin);
		
		
		
		return "redirect:/sudoadmin?name="+rootName;
		
	}
	
	@GetMapping("/editadmin")
	public ModelAndView showEditAdmin(ModelAndView model,@RequestParam String userid)
	{
		SudoAdmin admin = sudeoAdminService.getAdminById(userid);
		
		model.addObject("user",admin);
		
		model.setViewName("editadmin");
		
		return model;
	}
	
	@PostMapping("/updated")
	public String editAdmin(@RequestParam String uid,@RequestParam String password,@RequestParam String rolename,@RequestParam String name,@RequestParam String mobilenum,@RequestParam String emailid)
	{
		
		SudoAdmin sudoAdmin = new SudoAdmin();
		
		sudoAdmin.setUserLoginId(uid);
		
		sudoAdmin.setUserPassword(password);
		
        sudoAdmin.setUserRoleName(rolename);
		
		sudoAdmin.setUserName(name);
		
		sudoAdmin.setUserContactMobileNumber(Long.parseLong(mobilenum));
		
		sudoAdmin.setUserContactEmailId(emailid);
		
		sudeoAdminService.updateAdmin(sudoAdmin);
		
		return "redirect:/sudoadmin?name="+rootName;
		
	}
	
	@GetMapping("/deleteadminid")
	public ModelAndView showDeleteAdminForm(ModelAndView model,@RequestParam String userid)
	{
		SudoAdmin admin = sudeoAdminService.getAdminById(userid);
		
		model.addObject("sudo",admin);
		
		model.setViewName("deleteadmin");
		
		return model;
	}
	
	@PostMapping("/delete")
	public String deleteAdmin(@RequestParam String userid,@RequestParam String pwd,@RequestParam String rname,@RequestParam String name,@RequestParam String phno,@RequestParam String email)
	{
		
		SudoAdmin sudoAdmin = new SudoAdmin();
		
		sudoAdmin.setUserLoginId(userid);
		
		sudoAdmin.setUserPassword(pwd);
		
        sudoAdmin.setUserRoleName(rname);
		
		sudoAdmin.setUserName(name);
		
		sudoAdmin.setUserContactMobileNumber(Long.parseLong(phno));
		
		sudoAdmin.setUserContactEmailId(email);
		
		sudeoAdminService.deleteAdminById(sudoAdmin);
		
		return "redirect:/sudoadmin?name="+rootName;
		
	}
	
	@GetMapping("/changePassword")
	public ModelAndView showSudoChangePasswordAdminForm(ModelAndView model)
	{
		model.setViewName("sudochangepassword");
		
		return model;
	}
	
	@PostMapping("/newpassword")
	public String sudoChangePassword(@RequestParam String adminId,@RequestParam String newPassword)
	{
		SudoAdmin admin = sudeoAdminService.getAdminById(adminId);
		
		admin.setUserPassword(newPassword);
		
		sudeoAdminService.insertAdmin(admin);
		
		return "redirect:/sudoadmin?name="+rootName;
		
	}	
	
	@GetMapping("/deletecancle")
	public String backToSudoAdmin()
	{
		return "redirect:/sudoadmin?name="+rootName;
		
	}
	
	@GetMapping("/backsudo")
	public String backSudoAdmin()
	{
		return "redirect:/sudoadmin?name="+rootName;
		
	}
	
}
