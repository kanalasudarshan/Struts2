package org.ksr;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	String userName;
	String password;
	
	@Override
	public String execute() throws Exception {	
		return "success";
	}
		
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
