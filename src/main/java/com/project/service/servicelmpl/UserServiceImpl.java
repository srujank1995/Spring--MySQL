package com.project.service.servicelmpl;


import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.userEntity;
import com.project.repository.userRepo;
import com.project.service.UserService;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class UserServiceImpl implements UserService{
	
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private userRepo repo;

	@Override
	public userEntity findByMemberID(long memberID) {
		
		return repo.findByMemberID(memberID);
	}

	@Override
	public userEntity findByemailId(String emailId) {
		
		return repo.findByemailId(emailId);
	}

	@Override
	public userEntity save(userEntity user) {
		
		return repo.save(user);
	}

	@Override
	public userEntity addMember(userEntity user) {
		user.setMemberID(user.getMemberID());
		user.setCreatedAt(new Date());
		user.setUpdatedAt(new Date());
		return repo.save(user);
	}

	@Override
	public List<userEntity> findAll() {
		return repo.findAll();
	}
	
}
