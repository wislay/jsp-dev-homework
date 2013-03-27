package com.hs;

public class CourseServiceFactory {
	public static CourseService getDaoInstance() {
		return new CourseService();
	}
}
