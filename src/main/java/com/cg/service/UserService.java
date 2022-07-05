package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.User;
import com.cg.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	List<User> userList=new ArrayList<>();
	
	//User user=new User();
	public String validateUser(String userId ,String Password){
	  if( userRepository.findByuserIdAndPassword(userId, Password) != null) {
		  return "Valid user";
	  }
      return "Invalid user,Please Register";
	}
	
	public List<User>addUser(User user) 
	  {
		userList.add(user);
		return userList;
		}
	public List<User>removeUser(String id)
	{
		userRepository.deleteByUserId(id);
		return userRepository.findAll();
	}
	public String SignOut(String message) {
	   if(message.equals("SignOut")) {
		   return "signed out succesfully";
	   }
	   return "still signed in";
	}

}
