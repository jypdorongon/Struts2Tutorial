package com.jyp.training.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.jyp.training.data.User;
import com.jyp.training.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>, ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user = new User();

	private HttpServletRequest request;
	
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		if (StringUtils.isEmpty(user.getUserid())) {
			addFieldError("userid", "User id cannot be empty");
		}

		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password", "Password cannot be empty");
		}
	}

	public String execute() {
		LoginService service = new LoginService();
		if (service.getUserLogin(user.getUserid(), user.getPassword())) {
			return SUCCESS;
		}
		return LOGIN;
	}
	
	public String getLoginCredentials()
	{
		if(user.getUserid().equals("jyp") && user.getPassword().equals("pass"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("authorized", "yes");
			return "success";
		}
		
		addActionError("Please log in valid credentials.");
		return "failure";
	}

	public User getModel() {
		return user;
	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

}
