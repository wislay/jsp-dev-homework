package com.hs.action;
import java.util.*;

import org.apache.struts2.ServletActionContext;

import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class ShowOneUser extends ActionSupport {

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
		UserService svs = UserServiceFactory.getDaoInstance();
		String id = "";
		User u = svs.queryById(id);
		System.out.println(u.getId() + "\t" + u.getUname() + "\t" + u.getUtype());
	}
	
	public String execute () {
		UserService us = UserServiceFactory.getDaoInstance();
		User all = us.queryById(id);
		ServletActionContext.getRequest().setAttribute("all", all);
		String succ = "succ";
		return succ;
	}

}
