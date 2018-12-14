package com.smile.util;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class RightInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//获取session作用域ActionContext
		Map<String, Object> session = ActionContext.getContext().getSession();
		//判断session作用域中的数据
		if(session.get("loginUser")==null) {
			return "login";
		}else {
			return invocation.invoke();
		}
	}

}
