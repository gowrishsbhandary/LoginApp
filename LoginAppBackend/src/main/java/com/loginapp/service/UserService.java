package com.loginapp.service;


import com.loginapp.model.Login;
import com.loginapp.model.User;

public interface UserService {
	void register(User user);

	User validateUser(Login login);

}
