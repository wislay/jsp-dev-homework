package com.hs.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hs.CurriculumService;
import com.hs.CurriculumServiceFactory;
import com.hs.Student;
import com.hs.StudentCurriculum;
import com.hs.StudentService;
import com.hs.StudentServiceFactory;
import com.hs.Teacher;
import com.hs.TeacherService;
import com.hs.TeacherServiceFactory;
import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class MainPageAction extends ActionSupport {

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
				StudentService svs = StudentServiceFactory.getDaoInstance();
				String id = "";
				id = (String)session.getAttribute("stu_id");
				Student stu = svs.queryByStudentNo(id);
				
				System.out.println("[Test]id=" + id);
				/**
				 * Write back to session
				 */
				ServletActionContext.getRequest().setAttribute("stu_info", stu);
				
				CurriculumService crsvs = CurriculumServiceFactory.getDaoInstance();
				List sc = crsvs.queryByStudenNoInClass(stu.getStudentNoInClass());
				ServletActionContext.getRequest().setAttribute("sc_info", sc);
				
				ret = "student_main";
			}
			else if (user_type.equals("teacher")) {
				TeacherService tsvs = TeacherServiceFactory.getDaoInstance();
				String teacherNo = "";
				teacherNo = (String)session.getAttribute("t_no");
				Teacher teac = tsvs.queryByTeacherNo(teacherNo);
				
				ServletActionContext.getRequest().setAttribute("t_info", teac);
				
				CurriculumService crsvs = CurriculumServiceFactory.getDaoInstance();
				List sc = crsvs.queryByTeacherNo(teac.getTeacherNo());
				ServletActionContext.getRequest().setAttribute("sc_info", sc);
				
				ret = "teacher_main";
			}
			else if (user_type.equals("admin")) {
				CurriculumService crsvs = CurriculumServiceFactory.getDaoInstance();
				List cr = crsvs.queryAllCurriculum();
				ServletActionContext.getRequest().setAttribute("cr_info", cr);
				
				ret = "admin_main";
			}
			else {
				ret = "error";
			}
		}
		else {
			ret = "login_first";
		}
		
		
		return ret;
	}
}
