package com.hs.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String id = "";
	private String passwd = "";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private String tansUtypeIntoStr (int utype) {
		String ret = null;
		switch (utype) {
		case 1:
			ret = "student";
			break;
		case 2:
			ret = "teacher";
			break;
		case 3:
			ret = "admin";
			break;
		default:
			break;
		}
		return ret;
	}
	
	public String execute () {
		String ret = "";
		UserService us = UserServiceFactory.getDaoInstance();
		User u = us.queryById(id);
		
		if (null == u) {
			ret = "no_such_user";
		}
		else {
			if (passwd.equals(u.getPasswd())) {
				HttpSession session = ServletActionContext.getRequest().getSession();
				String user_type = "";
				user_type = tansUtypeIntoStr(u.getUtype());
				session.setAttribute("utype", user_type);
				if (user_type.equals("student")) {
					session.setAttribute("stu_id", u.getId());
				}
				else if (user_type.equals("teacher")) {
					session.setAttribute("t_no", u.getId());
				}
				else if (user_type.equals("admin")) {
					session.setAttribute("admin_id", u.getId());
				}
				ret = "login_succ";
			}
			else {
				ret = "wrong_passwd";
			}
		}
		
		return ret;
	}
}
