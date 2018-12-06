package com.smile.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.smile.po.User;

/**
 * 实现ModelDriven接口
 * ModelDriven接口是一个泛型接口，在里面传入需要使用的对象
 * 实现ModelDriven接口可以免去前端传输数据的麻烦
 * @author Administrator
 *
 */
public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	//因为在下面的execute方法中需要使用对象的元素，所以在这创建一个对象
	private User user;
	
	//因为实现了接口ModelDriven，所以需要实现它的方法getModel，在里面返回对象
	@Override
	public User getModel() {
		user = new User();
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		if(user.getUserName().equals("admin") && user.getPassWord().equals("123456")) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}

}
