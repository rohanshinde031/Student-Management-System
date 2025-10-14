package com.growstar.utility;

import com.growstar.Model.User;

public class inputValidation {
	
	  public static String validate(User user) {
	        if (user == null) {
	            return "User cannot be null";
	        }

	        if (user.getName() == null || user.getName().trim().isEmpty()) {
	            return "Name is required";
	        }

	        if (user.getAddress() == null || user.getAddress().trim().isEmpty()) {
	            return "Address is required";
	        }

	        if (user.getConstact() == null || user.getConstact().trim().isEmpty()) {
	            return "Contact is required";
	        } else if (!user.getConstact().matches("\\d{10}")) {  
	            // 10-digit number validation
	            return "Contact must be a 10-digit number";
	        }

	        if (user.getPassword() == null || user.getPassword().isEmpty()) {
	            return "Password is required";
	        } else if (user.getPassword().length() < 6) {  
	            return "Password must be at least 6 characters";
	        }

	        return null; // means valid
	    }

}
