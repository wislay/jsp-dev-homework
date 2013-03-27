package com.hs;

public class UserServiceFactory {
	public static UserService getDaoInstance() {
		return new UserService();
	}
}
