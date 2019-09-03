package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dao.UserDao;
import com.springboot.model.User;
import com.springboot.service.UserService;

/**
 * Class that implements the DAO interface and defines the operations
 * @author adharsh.moorthy
 *
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	/**
	 * Method to create user
	 * @param user
	 */
	public void createUser(User user) {
		userDao.save(user);
	}
	
	/**
	  * Method to get list of users
	  * @return
	  */
	public List<User> getUser() {
		return (List<User>) userDao.findAll();
	}
	
	/**
	  * Method to get a user based on ID
	  * @param id
	  * @return
	  */
	public User findById(String id) {
		return userDao.findOne(id);
	}

	/**
	  * Method to update the user details
	  * @param user
	  * @param id
	  * @return
	  */
	public User update(User user, String id) {
		return userDao.save(user);
	}

	/**
	  * Method to delete the particular user based on ID 
	  * @param id
	  */
	public void deleteUserById(String id) {
		userDao.delete(id);
	}

}
