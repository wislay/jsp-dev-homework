package com.hs.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public String execute () {
		String ret = "";
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("utype");
		
		ret = "logout_succ";
		
		return ret;
	}
}
