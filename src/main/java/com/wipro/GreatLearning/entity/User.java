package com.wipro.GreatLearning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_table")
public class User {
	
	
	private String name;
	@Id
	private String email;
	private String password;
	private long phone;
	

}
