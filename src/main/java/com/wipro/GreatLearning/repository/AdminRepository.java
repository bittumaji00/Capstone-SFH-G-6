package com.wipro.GreatLearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.GreatLearning.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

}
