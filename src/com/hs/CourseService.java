package com.hs;

import java.util.List;

public class CourseService implements CourseServiceIF {

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		CourseDAO dao = CourseDAOFactory.getDaoInstance();
		if (dao.queryByCourseId(course.getCourseId()) == null) {
			dao.insert(course);
		}
		else {
			System.out.println("Fail to execute CourseService.addCourse");
		}
	}

	@Override
	public void deleteCourse(String studnetNo) {
		// TODO Auto-generated method stub
		CourseDAO dao = CourseDAOFactory.getDaoInstance();
		if (dao.queryByCourseId(studnetNo) != null) {
			dao.delete(studnetNo);
		}
		else {
			System.out.println("Fail to execute CourseService.deleteCourse");
		}
	}

	@Override
	public void updateCourse(Course student) {
		// TODO Auto-generated method stub
		CourseDAO dao = CourseDAOFactory.getDaoInstance();
		if (dao.queryByCourseId(student.getCourseId()) != null) {
			dao.update(student);
		}
		else {
			System.out.println("Fail to execute CourseService.addCourse");
		}
	}

	@Override
	public List queryAllCourse() {
		// TODO Auto-generated method stub
		CourseDAO dao = CourseDAOFactory.getDaoInstance();
		return dao.queryAll();
	}

	@Override
	public Course queryByCourseId(String id) {
		// TODO Auto-generated method stub
		CourseDAO dao = CourseDAOFactory.getDaoInstance();
		return dao.queryByCourseId(id);
	}

}
