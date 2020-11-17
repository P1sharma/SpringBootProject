package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.modal.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
