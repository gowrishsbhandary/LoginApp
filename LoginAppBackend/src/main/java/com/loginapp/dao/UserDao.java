package com.loginapp.dao;

import com.loginapp.model.Login;
import com.loginapp.model.User;

public interface UserDao {

	void register(User user);

	User validateUser(Login login);

}



