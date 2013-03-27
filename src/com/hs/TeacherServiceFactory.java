package com.hs;

public class TeacherServiceFactory {
	public static TeacherService getDaoInstance() {
		return new TeacherService();
	}
}
