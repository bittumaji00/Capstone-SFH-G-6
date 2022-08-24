package com.wipro.GreatLearning.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.GreatLearning.dto.AdminDTO;
import com.wipro.GreatLearning.entity.Admin;
import com.wipro.GreatLearning.repository.AdminRepository;
import com.wipro.GreatLearning.service.IAdminService;

@Service
public class AdminServiceImp implements IAdminService {
	
	
	@Autowired
	private AdminRepository repo;

	@Override
	public String addAdmin(AdminDTO adminDto) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setEmail(adminDto.getEmail());
		admin.setPassword(adminDto.getPassword());
		if(repo.existsById(admin.getEmail())) {
			return "Admin data is already present";
		}
		else {
			repo.save(admin);
			return "New Admin data saved";
		}
		
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

}
