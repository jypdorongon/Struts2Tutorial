package com.jyp.training.service;

public class LoginService {

	
	public boolean getUserLogin(String userid, String password)
	{
		return (userid.equals("jyp") && password.equals("haha"));
	}
}
