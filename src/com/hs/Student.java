package com.hs;

public class Student {
	/**
	 * Constant
	 */
	public static int MALE = 1;
	public static int FEMALE = 2;
	/**
	 * Private
	 */
	private String studentNo = "";
	private String studentName = "";
	private int studentGender = MALE;
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
	public int getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(int studentGender) {
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
	
	public void print_attr () {
		System.out.println("studentNo="+ this.studentNo +
		" studentName=" + this.studentName +
		" studentGender="+ this.studentGender +
		" studentHometown=" + this.studentHometown +
		" studentBirthday=" + this.studentBirthday +
		" studentNoInClass=" + this.studentNoInClass +
		" studentEmail=" + this.studentEmail +
		" studentMobile=" + this.studentMobile);
	}
}
