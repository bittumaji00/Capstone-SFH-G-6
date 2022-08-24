package com.wipro.GreatLearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.GreatLearning.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
