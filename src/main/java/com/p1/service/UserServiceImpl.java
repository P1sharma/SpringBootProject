package com.p1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.modal.User;
import com.p1.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;

	public UserServiceImpl() {}
	
	public UserServiceImpl(UserRepository repo) {
		super();
		this.repo = repo;
	}

	public void saveUser(User user) {

		repo.save(user);
	}

}
