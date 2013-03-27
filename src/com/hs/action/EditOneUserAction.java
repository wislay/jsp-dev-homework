package com.hs.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class EditOneUserAction extends ActionSupport {

	private String id = "";
	private String uname = "";
	private String passwd = "";
	private int utype = 0;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getUtype() {
		return utype;
	}

	public void setUtype(int utype) {
		this.utype = utype;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public String execute () {
		UserService us = UserServiceFactory.getDaoInstance();
		User u = new User();
		u.setId(id);
		u.setUname(uname);
		u.setPasswd(passwd);
		u.setUtype(utype);
		us.updateUser(u);
		List all = us.queryAllUser();
		ServletActionContext.getRequest().setAttribute("all", all);
		String succ = "succ";
		return succ;
	}


}
