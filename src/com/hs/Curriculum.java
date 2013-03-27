package com.hs;

public class Curriculum {
	private String listNo = "";
	private String termNo = "";
	private String teacherNo = "";
	private String classNo = "";
	private String classroom = "";
	private String courseNo = "";
	private String startWeek = "";
	private String endWeek = "";
	private String startClass = "";
	private String endClass = "";
	
	public String getListNo() {
		return listNo;
	}
	public void setListNo(String listNo) {
		this.listNo = listNo;
	}
	
	public String getTermNo() {
		return termNo;
	}
	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String techerNo) {
		this.teacherNo = techerNo;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public String getStartWeek() {
		return startWeek;
	}
	public void setStartWeek(String startWeek) {
		this.startWeek = startWeek;
	}
	public String getEndWeek() {
		return endWeek;
	}
	public void setEndWeek(String endWeek) {
		this.endWeek = endWeek;
	}
	public String getStartClass() {
		return startClass;
	}
	public void setStartClass(String startClass) {
		this.startClass = startClass;
	}
	public String getEndClass() {
		return endClass;
	}
	public void setEndClass(String endClass) {
		this.endClass = endClass;
	}
	
	public void print_attr() {
		System.out.println("termNo=" + termNo +
				" tacherNo=" + teacherNo +
				" classNo=" + classNo +
				" classroom=" + classroom +
				" courseNo=" + courseNo +
				" startWeek=" + startWeek +
				" endWeek=" + endWeek +
				" startClass=" + startClass +
				" endClass=" + endClass);
	}
}
