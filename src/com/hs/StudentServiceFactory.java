package com.hs;

public class StudentServiceFactory {
	public static StudentService getDaoInstance() {
		return new StudentService();
	}
}
