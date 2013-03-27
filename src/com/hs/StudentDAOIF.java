package com.hs;
import java.util.List;

public interface StudentDAOIF {
	public void insert (Student student);
	public void update (Student student);
	public void delete (String studentNo);
	public Student queryByStudentNo (String studentNo);
	public List queryAll ();
}
