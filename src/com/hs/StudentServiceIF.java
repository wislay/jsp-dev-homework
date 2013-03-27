package com.hs;
import java.util.*;

public interface StudentServiceIF {
	public void addStudent (Student student);
	public void deleteStudent (String studnetNo);
	public void updateStudent (Student student);
	public List queryAllStudent ();
	public Student queryByStudentNo (String studentNo);
}
