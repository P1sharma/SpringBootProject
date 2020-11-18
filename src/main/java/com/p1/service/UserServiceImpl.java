package com.p1.service;

import java.util.List;

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

	@Override
	public List<User> showalluser() {
		// TODO Auto-generated method stub
		return (List<User>) repo.findAll();
	}

	@Override
	public Iterable<User> deleteByUserName(String uname) {
		 repo.deleteByuserName(uname);
		 return repo.findAll();
	}

	@Override
	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return repo.findByuserName(userName);
	}

}
