package com.jyp.training.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String password;
	
	
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


	public String execute() {
		if(getUserid().equals("jyp") && getPassword().equals("pass"))
		{
			return SUCCESS;
		}
		return ERROR;
	}
	
	@Override
	public void validate() {
		if(getUserid().isEmpty()){
			addFieldError(userid, "User id cannot be empty");
		}

		if(getPassword().isEmpty()){
			addFieldError(password, "Password cannot be empty");
		}
	}

}
