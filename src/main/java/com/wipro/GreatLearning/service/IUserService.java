package com.wipro.GreatLearning.service;

import java.util.List;

import com.wipro.GreatLearning.dto.UserDTO;
import com.wipro.GreatLearning.entity.User;

public interface IUserService {
	
	public String addUser(UserDTO userDto);
	
	public List<User> getAllUser();
	
	public String updateUser(UserDTO userDto);
	
	public String deleteUser(String email);

}
