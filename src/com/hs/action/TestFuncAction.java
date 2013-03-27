package com.hs.action;
import java.util.*;

import org.apache.struts2.ServletActionContext;

import com.hs.Student;
import com.hs.StudentService;
import com.hs.StudentServiceFactory;
import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class TestFuncAction extends ActionSupport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService svs = StudentServiceFactory.getDaoInstance();
		Student stu = svs.queryByStudentNo("09211002");
		if (null != stu) {
			stu.print_attr();
		}

	}
	
	public String execute () {
		StudentService svs = StudentServiceFactory.getDaoInstance();
		Student stu = svs.queryByStudentNo("09211002");
		if (null != stu) {
			stu.print_attr();
		}
		else {
			System.out.println("Error in TestFuncAction!");
		}
		String succ = "succ";
		return succ;
	}

}
