package com.hs;

public class TeacherCurriculum {
	String termNo;
	String classNo;
	String classroom;
	String courseName;
	String startWeek;
	String endWeek;
	String startClass;
	String endClass;
	public String getTermNo() {
		return termNo;
	}
	public void setTermNo(String termNo) {
		this.termNo = termNo;
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
				" classNo=" + classNo +
				" classroom=" + classroom +
				" courseName=" + courseName +
				" startWeek=" + startWeek +
				" endWeek=" + endWeek +
				" startClass=" + startClass +
				" endClass=" + endClass);
	}
}
