package com.hs.action;
import java.util.*;

import org.apache.struts2.ServletActionContext;

import com.hs.Student;
import com.hs.StudentService;
import com.hs.StudentServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class ShowOneStudentForEdit extends ActionSupport {

	private String studentNo = "";

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService svs = StudentServiceFactory.getDaoInstance();
		Student stu = svs.queryByStudentNo("09211002");
		if (null == stu) {
			System.out.println("Erorr in ShowOneStudentForEdit");
		}
		else {
			stu.print_attr();
		}
	}
	
	public String execute () {
		StudentService svs = StudentServiceFactory.getDaoInstance();
		Student stu = svs.queryByStudentNo(studentNo);
		ServletActionContext.getRequest().setAttribute("stu_info", stu);
		String ret = "succ";
		return ret;
	}

}
