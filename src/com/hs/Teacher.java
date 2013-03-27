package com.hs;

public class Teacher {
	/**
	 * Constant
	 */
	public static int MALE = 1;
	public static int FEMALE = 2;
	/**
	 * Private
	 */
	private String teacherNo = "";
	private String teacherName = "";
	private int teacherGender = MALE;
	private String teacherEmail = "";
	private String teacherMobile = "";
	
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherGender() {
		return teacherGender;
	}
	public void setTeacherGender(int teacherGender) {
		this.teacherGender = teacherGender;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public String getTeacherMobile() {
		return teacherMobile;
	}
	public void setTeacherMobile(String teacherMobile) {
		this.teacherMobile = teacherMobile;
	}
	
	public void print_attr () {
		System.out.println("teacherNo=" + this.teacherNo +
				" teacherName=" + this.teacherName +
				" teacherGender="+ this.teacherGender +
				" teacherEmail=" + this.teacherEmail +
				" teacherMobile=" + this.teacherMobile);
	}
}
