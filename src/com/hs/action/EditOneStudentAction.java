package com.hs.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.hs.Student;
import com.hs.StudentService;
import com.hs.StudentServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class EditOneStudentAction extends ActionSupport {

	private String studentNo = "";
	private String studentName = "";
	private String studentGender = "";
	private String studentHometown = "";
	private String studentBirthday = "";
	private String studentNoInClass = "";
	private String studentEmail = "";
	private String studentMobile = "";
	
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentHometown() {
		return studentHometown;
	}

	public void setStudentHometown(String studentHometown) {
		this.studentHometown = studentHometown;
	}

	public String getStudentBirthday() {
		return studentBirthday;
	}

	public void setStudentBirthday(String studentBirthday) {
		this.studentBirthday = studentBirthday;
	}

	public String getStudentNoInClass() {
		return studentNoInClass;
	}

	public void setStudentNoInClass(String studentNoInClass) {
		this.studentNoInClass = studentNoInClass;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public String execute () {
		StudentService svs = StudentServiceFactory.getDaoInstance();
		Student stu = new Student();
		stu.setStudentNo(studentNo);
		stu.setStudentName(studentName);
		stu.setStudentGender(studentGender.equals("男")?1:2);
		stu.setStudentHometown(studentHometown);
		stu.setStudentBirthday(studentBirthday);
		stu.setStudentNoInClass(studentNoInClass);
		stu.setStudentEmail(studentEmail);
		stu.setStudentMobile(studentMobile);
		
		svs.updateStudent(stu);
		
		String ret = "succ";
		return ret;
	}
}
