package com.jyp.training.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String password;
	
	

	public void validate() {
		if(StringUtils.isEmpty(getUserid())){
			addFieldError("userid", "User id cannot be empty");
		}

		if(StringUtils.isEmpty(getPassword())){
			addFieldError("password", "Password cannot be empty");
		}
	}

	public String execute() {
		if(getUserid().equals("jyp") && getPassword().equals("pass"))
		{
			return SUCCESS;
		}
		return LOGIN;
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
