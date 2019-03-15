package com.loginapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.loginapp.dao.UserDao;
import com.loginapp.model.Login;
import com.loginapp.model.User;

public class UserServiceImpl {
	
	@Autowired
	  public UserDao userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }
}
