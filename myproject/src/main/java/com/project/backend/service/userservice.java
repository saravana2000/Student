package com.project.backend.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.project.backend.model.user;

@Service
public interface userservice {
	
	public user createUser(user user);
	
	public List<user> getUser();
	
	public user getUserbyid(int id);
	
	public void deleteUser(int id);
	
	public user updateUser(int id,user user);
}
