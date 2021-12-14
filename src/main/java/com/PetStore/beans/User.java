package com.PetStore.beans;

public class User {
	/**
	 * General user template for buyer/seller. Seller will only implemented as breeder. 
	 * 
	 */
	
	private String name;
	private int ID;
	private String username;
	private String PW;
	private String usertype;
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPW() {
		return PW;
	}

	public String getUserType() {
		return usertype;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setID(int ID) {
		this.ID=ID;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public void setPW(String PW) {
		this.PW=PW;
	}
	
	public void setUserType(String usertype) {
		this.usertype=usertype;
	}
}
