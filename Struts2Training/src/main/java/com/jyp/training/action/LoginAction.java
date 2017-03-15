package com.jyp.training.action;

public class LoginAction extends AbsAction {

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


	@Override
	public String execute() {
		if(getUserid().equals("jyp") && getPassword().equals("pass"))
		{
			return "success";
		}
		return "failure";
	}

}
