package com.jyp.training.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthInterceptor implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map<String, Object> sessionAttribute = actionInvocation.getInvocationContext().getSession();
		if(sessionAttribute==null || sessionAttribute.get("authorized")==null)
		{
			return "failure";
		}
		
		if(sessionAttribute.get("authorized").equals("yes"))
		{
			return actionInvocation.invoke();
		}
		return "failure";
	}
	
	

}
