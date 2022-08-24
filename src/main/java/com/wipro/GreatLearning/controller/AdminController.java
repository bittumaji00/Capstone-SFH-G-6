package com.wipro.GreatLearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.GreatLearning.dto.AdminDTO;
import com.wipro.GreatLearning.entity.Admin;
import com.wipro.GreatLearning.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IAdminService service;
	
	@PostMapping("/add-admin")
	public String addAdmin(@RequestBody AdminDTO dto) {
		return service.addAdmin(dto);
	}
	
	@GetMapping("/getAll")
	public List<Admin> getAllAdmins(){
		return service.getAllAdmin();
	}

}
