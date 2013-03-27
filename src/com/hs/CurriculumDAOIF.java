package com.hs;
import java.util.List;

public interface CurriculumDAOIF {
	public void insert (Curriculum curriculum);
	public void update (Curriculum curriculum);
	public void delete (String listNo);
	public Curriculum queryByListNo (String listNo);
	public List queryAll ();
	public List queryByStudentNoInClass (String studentNoInClass);
	public List queryByTeacherNo (String teacherNo);
}
