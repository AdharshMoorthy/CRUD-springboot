package com.springboot.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.springboot.model.User;

/**
 * A Data Access Object Interface that defines the list of operations required
 * for User
 * 
 * @author adharsh.moorthy
 *
 */
public interface UserDao extends CrudRepository<User, Serializable>{
	

}
