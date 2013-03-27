package com.hs;

public class StudentCurriculum {
	private String termNo;
	private String teacherName;
	private String classNo;
	private String classroom;
	private String courseName;
	private String startWeek;
	private String endWeek;
	private String startClass;
	private String endClass;
	
	public String getTermNo() {
		return termNo;
	}
	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String tacherName) {
		this.teacherName = tacherName;
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
				" teacherName=" + teacherName +
				" classNo=" + classNo +
				" classroom=" + classroom +
				" courseName=" + courseName +
				" startWeek=" + startWeek +
				" endWeek=" + endWeek +
				" startClass=" + startClass +
				" endClass=" + endClass);
	}
}
