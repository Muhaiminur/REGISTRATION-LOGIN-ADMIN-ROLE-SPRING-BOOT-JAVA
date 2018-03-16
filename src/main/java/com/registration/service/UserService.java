package com.registration.service;

import com.registration.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}