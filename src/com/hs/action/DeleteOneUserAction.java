package com.hs.action;

import java.util.*;

import org.apache.struts2.ServletActionContext;

import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteOneUserAction extends ActionSupport {

	private String id = "";
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService us = UserServiceFactory.getDaoInstance();
		us.deleteUser("09211552");
	}
	
	public String execute () {
		UserService us = UserServiceFactory.getDaoInstance();
		us.deleteUser(id);
		List all = us.queryAllUser();
		ServletActionContext.getRequest().setAttribute("all", all);
		String succ = "succ";
		return succ;
	}

}
