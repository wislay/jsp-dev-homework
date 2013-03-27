package com.hs;

public class UserDAOFactory {
	public static UserDAO getDaoInstance() {
		return new UserDAO();
	}
}
