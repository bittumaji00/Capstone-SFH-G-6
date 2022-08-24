package com.wipro.GreatLearning.serviceImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.GreatLearning.dto.UserDTO;
import com.wipro.GreatLearning.entity.User;
import com.wipro.GreatLearning.repository.UserRepository;
import com.wipro.GreatLearning.service.IUserService;

@Service
public class UserServiceImp implements IUserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public String addUser(UserDTO userDto) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setEmail(userDto.getEmail());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setPhone(userDto.getPhone());
		
		if(repo.existsById(user.getEmail())) {
			 return "User Already Exists!!  ";
		}
		else {
			repo.save(user);
			return "New User Registered";
		}
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(UserDTO userDto) {
		// TODO Auto-generated method stub
		User userToUpdate=new User();
		userToUpdate.setEmail(userDto.getEmail());
		userToUpdate.setName(userDto.getName());
		userToUpdate.setPhone(userDto.getPhone());
		userToUpdate.setPassword(userDto.getPassword());
		
		repo.save(userToUpdate);
		
		return "User Updated Successfully";
	}

	@Override
	public String deleteUser(String email) {
		// TODO Auto-generated method stub
		
		repo.deleteById(email);
		return "User deleted";
	}

}
