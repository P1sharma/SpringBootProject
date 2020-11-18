package com.p1.service;

import java.util.List;

import com.p1.modal.User;

public interface UserService {
	
	public void saveUser(User user);

	public List<User> showalluser();

	public Iterable<User> deleteByUserName(String uname);

	public User findByUserName(String userName);

}
