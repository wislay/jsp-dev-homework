package com.hs;
import java.util.List;

public interface CourseDAOIF {
	public void insert (Course course);
	public void update (Course course);
	public void delete (String courseId);
	public Course queryByCourseId (String courseId);
	public List queryAll ();
}
