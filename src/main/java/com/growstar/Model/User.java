package com.growstar.Model;


public class User {

	private long id;
	private String name;
	private String Address;
	private String constact;
	private String password;
	
	public User()
	{}
	
	public User(long id, String name, String address, String constact, String password) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.constact = constact;
		this.password = password;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getConstact() {
		return constact;
	}
	public void setConstact(String constact) {
		this.constact = constact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Address=" + Address + ", constact=" + constact + ", password="
				+ password + "]";
	}
	
	
	
}
