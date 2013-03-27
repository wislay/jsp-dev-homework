package com.hs;

public class StudentDAOFactory {
	public static StudentDAO getDaoInstance() {
		return new StudentDAO();
	}
}
