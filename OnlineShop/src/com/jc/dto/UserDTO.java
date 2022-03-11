package com.jc.dto;
//dto for data transfer
public class UserDTO {
    private String userid;
    private String password;
    
    
	public UserDTO(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
