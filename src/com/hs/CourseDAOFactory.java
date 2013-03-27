package com.hs;

public class CourseDAOFactory {
	public static CourseDAO getDaoInstance() {
		return new CourseDAO();
	}
}
