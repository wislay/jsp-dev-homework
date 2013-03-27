package com.hs;
import java.util.*;

public interface CourseServiceIF {
	public void addCourse (Course course);
	public void deleteCourse (String courseId);
	public void updateCourse (Course course);
	public List queryAllCourse ();
	public Course queryByCourseId (String courseId);
}
