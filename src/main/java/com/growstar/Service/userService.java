package com.growstar.Service;

import com.growstar.Model.User;
import com.growstar.dao.UserDao;
import com.growstar.dao.UserDaoImpl;
import com.growstar.utility.inputValidation;

public class userService {
	
	private  UserDao userdao = new UserDaoImpl();;
	
	private inputValidation  UserValidator;
	
	  public boolean registerUser(User user) {
		  String validationError = UserValidator.validate(user);
	        if (validationError != null) {
	            System.out.println("Validation Failed: " + validationError);
	        return  false;
	        }
	        
	        return userdao.addUser( user);
	    }

}
