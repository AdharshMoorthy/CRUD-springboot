package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.User;
import com.springboot.service.UserService;

/**
 * 
 * @author adharsh.moorthy
 *
 */
@RestController
public class UserController {
	
	@Autowired
    UserService userService;

    @GetMapping("user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PostMapping(value="/createUser")
    public ResponseEntity<Void> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @GetMapping(value="/getUsers")
    public List<User> getAllUser() {
        List<User> tasks=userService.getUser();
        return tasks;

    }

    @PutMapping(value="/updateUser")
    public ResponseEntity<String> updateUser(@RequestBody User currentUser)
    {
        User user = userService.findById(currentUser.getId());
        if (user==null) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        userService.update(currentUser, currentUser.getId());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @DeleteMapping(value="/deleteUser/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") String id){
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        userService.deleteUserById(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

}
