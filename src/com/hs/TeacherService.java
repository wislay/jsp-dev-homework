package com.hs;

import java.util.List;

public class TeacherService implements TeacherServiceIF {

	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		TeacherDAO dao = TeacherDAOFactory.getDaoInstance();
		if (dao.queryByTeacherNo(teacher.getTeacherNo()) == null) {
			dao.insert(teacher);
		}
		else {
			System.out.println("Fail to execute TeacherService.addTeacher");
		}
	}

	@Override
	public void deleteTeacher(String studnetNo) {
		// TODO Auto-generated method stub
		TeacherDAO dao = TeacherDAOFactory.getDaoInstance();
		if (dao.queryByTeacherNo(studnetNo) != null) {
			dao.delete(studnetNo);
		}
		else {
			System.out.println("Fail to execute TeacherService.deleteTeacher");
		}
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		TeacherDAO dao = TeacherDAOFactory.getDaoInstance();
		if (dao.queryByTeacherNo(teacher.getTeacherNo()) != null) {
			dao.update(teacher);
		}
		else {
			System.out.println("Fail to execute TeacherService.addTeacher");
		}
	}

	@Override
	public List queryAllTeacher() {
		// TODO Auto-generated method stub
		TeacherDAO dao = TeacherDAOFactory.getDaoInstance();
		return dao.queryAll();
	}

	@Override
	public Teacher queryByTeacherNo(String id) {
		// TODO Auto-generated method stub
		TeacherDAO dao = TeacherDAOFactory.getDaoInstance();
		return dao.queryByTeacherNo(id);
	}

}
