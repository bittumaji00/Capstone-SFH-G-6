package com.wipro.GreatLearning.service;

import java.util.List;

import com.wipro.GreatLearning.dto.AdminDTO;
import com.wipro.GreatLearning.entity.Admin;

public interface IAdminService {
	
	public String addAdmin(AdminDTO adminDto);
	
	public List<Admin> getAllAdmin();

}
