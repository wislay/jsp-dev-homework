package com.hs;

public class User {
	/**
	 * Constant
	 */
	public final int USER_TYPE_NOBODY = 0;
	public final int USER_TYPE_STUDENT = 1;
	public final int USER_TYPE_TEACHER = 2;
	public final int USER_TYPE_ADMIN = 3;
	
	/**
	 * Private
	 */
	private String id = "";
	private String uname = "";
	private String passwd = "";
	private int utype = USER_TYPE_NOBODY;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() of class[User]");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getUtype() {
		return utype;
	}
	public void setUtype(int utype) {
		this.utype = utype;
	}

}
