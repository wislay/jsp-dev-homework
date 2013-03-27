package com.hs;

import java.util.List;

public class StudentService implements StudentServiceIF {

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		StudentDAO dao = StudentDAOFactory.getDaoInstance();
		if (dao.queryByStudentNo(student.getStudentNo()) == null) {
			dao.insert(student);
		}
		else {
			System.out.println("Fail to execute StudentService.addStudent");
		}
	}

	@Override
	public void deleteStudent(String studnetNo) {
		// TODO Auto-generated method stub
		StudentDAO dao = StudentDAOFactory.getDaoInstance();
		if (dao.queryByStudentNo(studnetNo) != null) {
			dao.delete(studnetNo);
		}
		else {
			System.out.println("Fail to execute StudentService.deleteStudent");
		}
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		StudentDAO dao = StudentDAOFactory.getDaoInstance();
		if (dao.queryByStudentNo(student.getStudentNo()) != null) {
			dao.update(student);
		}
		else {
			System.out.println("Fail to execute StudentService.addStudent");
		}
	}

	@Override
	public List queryAllStudent() {
		// TODO Auto-generated method stub
		StudentDAO dao = StudentDAOFactory.getDaoInstance();
		return dao.queryAll();
	}

	@Override
	public Student queryByStudentNo(String id) {
		// TODO Auto-generated method stub
		StudentDAO dao = StudentDAOFactory.getDaoInstance();
		return dao.queryByStudentNo(id);
	}

}
