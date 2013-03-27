package com.hs.action;
import java.util.*;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class ShowOneUserForEdit extends ActionSupport {

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
		HttpSession session = ServletActionContext.getRequest().getSession();
		/**
		 * Get attribute of this session
		 */
		String user_type = null;
		user_type = (String)session.getAttribute("utype");
		System.out.println("[Test]user_type=" + user_type);
		
		String ret = "";
		
		if (user_type != null) {
//			if (user_type.equals("student")) {
				UserService us = UserServiceFactory.getDaoInstance();
				User u = us.queryById(id);
				ServletActionContext.getRequest().setAttribute("one", u);
				ret = "succ";
//			}
//			else {
//				ret = "error";
//			}
		}
		else {
			ret = "login_first";
		}
		return ret;
	}

}
