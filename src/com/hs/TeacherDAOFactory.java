package com.hs;

public class TeacherDAOFactory {
	public static TeacherDAO getDaoInstance() {
		return new TeacherDAO();
	}
}
