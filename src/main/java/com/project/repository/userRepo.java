package com.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.entity.userEntity;

public interface userRepo extends CrudRepository<userEntity, Long> {
	
	userEntity findByMemberID(Long memberID);
	
	userEntity findByemailId(String emailId);
	
	List<userEntity> findAll();
}
