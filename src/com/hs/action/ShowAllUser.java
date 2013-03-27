package com.hs.action;
import java.util.*;

import org.apache.struts2.ServletActionContext;

import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllUser extends ActionSupport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService svs = UserServiceFactory.getDaoInstance();
		List ret = svs.queryAllUser();
		Iterator it = ret.iterator();
		
		while (it.hasNext()) {
			User u = (User)it.next();
			System.out.println(u.getId() + "\t" + u.getUname() + "\t" + u.getUtype());
		}

	}
	
	public String execute () {
		UserService us = UserServiceFactory.getDaoInstance();
		List all = us.queryAllUser();
		ServletActionContext.getRequest().setAttribute("all", all);
		String succ = "succ";
		return succ;
	}

}
