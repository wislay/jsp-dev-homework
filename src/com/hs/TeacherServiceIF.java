package com.hs;
import java.util.*;

public interface TeacherServiceIF {
	public void addTeacher (Teacher teacher);
	public void deleteTeacher (String studnetNo);
	public void updateTeacher (Teacher teacher);
	public List queryAllTeacher ();
	public Teacher queryByTeacherNo (String teacherNo);
}
