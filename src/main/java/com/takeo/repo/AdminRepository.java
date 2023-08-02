package com.takeo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

import com.takeo.entity.Admin;


public interface AdminRepository extends MongoRepository<Admin, Long> {
	
	//@Query("select firstname from Admin")
	List<Admin> getAdminByUsername(Admin admin);

	public Admin verifyUsernameAndPassword(String username, String password);
	

}
