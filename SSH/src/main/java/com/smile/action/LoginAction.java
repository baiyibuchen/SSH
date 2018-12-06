package com.smile.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	@Override
	public String execute() throws Exception {
		if(this.userName.equals("admin") && this.passWord.equals("123456")) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}

}
