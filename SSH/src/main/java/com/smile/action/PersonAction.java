package com.smile.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.smile.po.User;

public class PersonAction extends ActionSupport implements ModelDriven<User>{
	
	private User user;
	
	public String register() {
		System.out.println(user.getBirthday());
		return SUCCESS;
	}

	@Override
	public User getModel() {
		this.user = new User();
		return null;
	}

}
