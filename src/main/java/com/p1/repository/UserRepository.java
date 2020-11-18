package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.p1.modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public Iterable<User> deleteByuserName(String userName);
	
	public User findByuserName(String userName);

}
