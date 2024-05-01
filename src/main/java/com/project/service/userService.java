package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.userEntity;

@Service

public class userService {
	
	userEntity findByMemberID(long memberID);
	
	userEntity findByemailId(String emailId);
	
	userEntity save(userEntity user);
	userEntity addMember(userEntity user);
	
	List<userEntity> findAll();
}
