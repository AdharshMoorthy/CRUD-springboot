package com.springboot.service;

import java.util.List;

import com.springboot.model.User;

/**
 * Service class to defines the operations
 * @author adharsh.moorthy
 *
 */
public interface UserService {
	/**
	 * Method to create user
	 * @param user
	 */
	 public void createUser(User user);
	 /**
	  * Method to get list of users
	  * @return
	  */
	 public List<User> getUser();
	 /**
	  * Method to get a user based on ID
	  * @param id
	  * @return
	  */
	 public User findById(final String id);
	 /**
	  * Method to update the user details
	  * @param user
	  * @param id
	  * @return
	  */
	 public User update(User user, final String id);
	 /**
	  * Method to delete the particular user based on ID 
	  * @param id
	  */
	 public void deleteUserById(final String id);

}
