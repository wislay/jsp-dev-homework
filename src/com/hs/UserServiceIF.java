package com.hs;
import java.util.*;

public interface UserServiceIF {
	public void addUser (User u);
	public void deleteUser (String id);
	public void updateUser (User u);
	public List queryAllUser ();
	public User queryById (String id);
}
