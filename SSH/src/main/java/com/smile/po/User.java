package com.smile.po;

/**
 * 一个pojo类，里面的元素内容和前端传入的内容一致，实现其get和set方法
 * @author Administrator
 *
 */
public class User {
	
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
	

}
