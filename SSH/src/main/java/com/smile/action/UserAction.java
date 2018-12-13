package com.smile.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.smile.po.User;

public class UserAction extends ActionSupport implements ModelDriven<User>,RequestAware,SessionAware,ApplicationAware{
	
	private User user;
	private Map<String, Object> application;
	private Map<String, Object> session;
	private Map<String, Object> request;
	
	@Override
	public String execute() throws Exception {
		if(user.getUserName().equals("admin")&&user.getPassWord().equals("123456")) {
			//将数据存储到request域中
			request.put("r1", "欢迎登录!");
			return SUCCESS;
		}else {
			//将数据存储在session域中
			session.put("s1", "账号或密码输入错误");
			return ERROR;
		}
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
