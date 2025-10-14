package com.growstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.growstar.Model.User;
import com.growstar.utility.dbConnnection;

public class UserDaoImpl implements UserDao{

	private dbConnnection dbconn =new dbConnnection();
	
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try (Connection conn = dbconn.getConnection()) {
			if(!isUserExists( user.getConstact()))
			{
            String sql = "INSERT INTO users(name,address, contact,password) VALUES (?, ?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(3, user.getConstact());
            ps.setString(2, user.getAddress());
            ps.setString(4, user.getPassword());
            return ps.executeUpdate() > 0;
			}else {
				System.out.println("User already exist with contact "+user.getConstact());
				return false;
			}
			
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	
	}

	public boolean isUserExists(String contact) {
	    String sql = "SELECT COUNT(*) FROM users WHERE contact = ?";
	    try (Connection conn = dbconn.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {
	        ps.setString(1, contact);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            return rs.getInt(1) > 0; // true if record exists
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}
	
	@Override
	public User getUserByid(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeUserByid(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
