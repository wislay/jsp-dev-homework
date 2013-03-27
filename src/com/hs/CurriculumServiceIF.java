package com.hs;
import java.util.*;

public interface CurriculumServiceIF {
	public void addCurriculum (Curriculum curriculum);
	public void deleteCurriculum (String listNo);
	public void updateCurriculum (Curriculum curriculum);
	public List queryAllCurriculum ();
	public Curriculum queryByListNo (String listNo);
	public List queryByStudenNoInClass (String studentNoInClass);
	public List queryByTeacherNo (String teacherNo);
}
