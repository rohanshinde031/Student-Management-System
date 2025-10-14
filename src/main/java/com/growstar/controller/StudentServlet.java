package com.growstar.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.growstar.Model.User;
import com.growstar.Service.userService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentServlet extends HttpServlet{
	
	    private userService service = new userService();

	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {

	        // 1. Get inputs from request
	        String name = req.getParameter("name");
	        String address = req.getParameter("address");
	        String contact = req.getParameter("contact");
	        String password = req.getParameter("password");

	        // 2. Create User object
	        User user = new User();
	        user.setName(name);
	        user.setAddress(address);
	        user.setConstact(contact);   // your field spelling
	        user.setPassword(password);

	        // 3. Pass User object to service
	        boolean saved = service.registerUser(user);

	        // 4. Send response
	        if (saved) {
	            req.setAttribute("message", "User registered successfully!");
	            req.getRequestDispatcher("success.jsp").forward(req, resp);
	        } else {
	            req.setAttribute("error", "Validation failed or duplicate user!");
	            req.getRequestDispatcher("index.jsp").forward(req, resp);
	        }
	    }
	


}
