package com.project.backend.repository;

import org.springframework.stereotype.Repository;
import com.project.backend.model.user;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface userrepository extends CrudRepository<user,Integer>{
	
}
