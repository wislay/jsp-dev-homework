package com.hs.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hs.Student;
import com.hs.StudentService;
import com.hs.StudentServiceFactory;
import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordAction extends ActionSupport {
	
	String passwd = "";

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
		StudentService svs = StudentServiceFactory.getDaoInstance();
		Student stu = svs.queryByStudentNo("﻿09211002");
		if (null == stu) {
			System.out.println("No student");
		}
		else {
			stu.print_attr();
		}
	}
	
	public String execute () {
		String ret = "";
		
		/**
		 * Get session object
		 */
		HttpSession session = ServletActionContext.getRequest().getSession();
		/**
		 * Get attribute of this session
		 */
		String user_type = null;
		user_type = (String)session.getAttribute("utype");
		System.out.println("[Test]user_type=" + user_type);
		
		if (user_type != null) {
			if (user_type.equals("student")) {
				UserService us = UserServiceFactory.getDaoInstance();
				String id = "";
				id = (String)session.getAttribute("stu_id");
				User u = us.queryById(id);
				u.setPasswd(passwd);
				us.updateUser(u);
				
				System.out.println("[Test]id=" + id);
				/**
				 * Write back to session
				 */
				
				if (null == u) {
					System.out.println("[Test]u is empty");
				}
				
				ret = "changed";
			}
			else if (user_type.equals("teacher")) {
				UserService us = UserServiceFactory.getDaoInstance();
				String id = "";
				id = (String)session.getAttribute("t_no");
				User u = us.queryById(id);
				u.setPasswd(passwd);
				us.updateUser(u);
				
				ret = "changed";
			}
			else if (user_type.equals("admin")) {
				UserService us = UserServiceFactory.getDaoInstance();
				String id = "";
				id = (String)session.getAttribute("admin_id");
				User u = us.queryById(id);
				u.setPasswd(passwd);
				us.updateUser(u);
				
				ret = "changed";
			}
			else {
				ret = "error";
			}
		}
		else {
			ret = "error";
		}
		
		
		return ret;
	}
}
