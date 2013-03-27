package com.hs;
import java.util.List;

public interface UserDAOIF {
	public void insert (User user);
	public void update (User user);
	public void delete (String id);
	public User queryById (String id);
	public List queryAll ();
}
