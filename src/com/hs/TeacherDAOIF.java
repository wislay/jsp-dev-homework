package com.hs;
import java.util.List;

public interface TeacherDAOIF {
	public void insert (Teacher teacher);
	public void update (Teacher teacher);
	public void delete (String teacherNo);
	public Teacher queryByTeacherNo (String teacherNo);
	public List queryAll ();
}
