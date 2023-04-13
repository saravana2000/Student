package com.project.backend.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.backend.model.user;
import com.project.backend.repository.userrepository;

@Service
public class userserviceimp implements userservice{

	@Autowired
	private userrepository userrepository;
	
	@Override
	public user createUser(user user) {
		return userrepository.save(user);
	}

	@Override
	public List<user> getUser() {
		
		return (List<user>) userrepository.findAll();
	}

	@Override
	public user getUserbyid(int id) {
		
		return userrepository.findById(id).get();
	}

	@Override
	public void deleteUser(int id) {
		
		userrepository.deleteById(id);
	}

	@Override
	public user updateUser(int id,user user) {
		
		user user1 = userrepository.findById(id).get();
		user1.setEmail(user.getEmail());
		user1.setpNo(user.getpNo());
		user1.setAddress(user.getAddress());
		return userrepository.save(user1);
	}

}
