package com.hs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CurriculumService implements CurriculumServiceIF {

	@Override
	public void addCurriculum(Curriculum curriculum) {
		// TODO Auto-generated method stub
		CurriculumDAO dao = CurriculumDAOFactory.getDaoInstance();
		if (dao.queryByListNo(curriculum.getListNo()) == null) {
			dao.insert(curriculum);
		}
		else {
			System.out.println("Fail to execute CurriculumService.addCurriculum");
		}
	}

	@Override
	public void deleteCurriculum(String listNo) {
		// TODO Auto-generated method stub
		CurriculumDAO dao = CurriculumDAOFactory.getDaoInstance();
		if (dao.queryByListNo(listNo) != null) {
			dao.delete(listNo);
		}
		else {
			System.out.println("Fail to execute CurriculumService.deleteCurriculum");
		}
	}

	@Override
	public void updateCurriculum(Curriculum curriculum) {
		// TODO Auto-generated method stub
		CurriculumDAO dao = CurriculumDAOFactory.getDaoInstance();
		if (dao.queryByListNo(curriculum.getListNo()) != null) {
			dao.update(curriculum);
		}
		else {
			System.out.println("Fail to execute CurriculumService.addCurriculum");
		}
	}

	@Override
	public List queryAllCurriculum() {
		// TODO Auto-generated method stub
		CurriculumDAO dao = CurriculumDAOFactory.getDaoInstance();
		return dao.queryAll();
	}

	@Override
	public Curriculum queryByListNo(String id) {
		// TODO Auto-generated method stub
		CurriculumDAO dao = CurriculumDAOFactory.getDaoInstance();
		return dao.queryByListNo(id);
	}

	@Override
	public List queryByStudenNoInClass(String studentNoInClass) {
		// TODO Auto-generated method stub
		CurriculumDAO dao = CurriculumDAOFactory.getDaoInstance();
		List tmp = dao.queryByStudentNoInClass(studentNoInClass);
		List ret = null;
		Iterator it = tmp.iterator();
		if (it.hasNext()) {
			ret = new ArrayList<StudentCurriculum>();
		}
		while (it.hasNext()) {
			Curriculum cr = (Curriculum)it.next();
			System.out.println("teacherNo=" + cr.getTeacherNo());
			TeacherService ts = TeacherServiceFactory.getDaoInstance();
			Teacher t = ts.queryByTeacherNo(cr.getTeacherNo());
			CourseService cs = CourseServiceFactory.getDaoInstance();
			Course c = cs.queryByCourseId(cr.getCourseNo());
			StudentCurriculum sc = new StudentCurriculum();
			sc.setClassNo(cr.getClassNo());
			sc.setClassroom(cr.getClassroom());
			sc.setCourseName(c.getCourseName());
			sc.setEndClass(cr.getEndClass());
			sc.setStartClass(cr.getStartClass());
			sc.setEndWeek(cr.getEndWeek());
			sc.setStartWeek(cr.getStartWeek());
			sc.setTeacherName(t.getTeacherName());
			sc.setTermNo(cr.getTermNo());
			sc.print_attr();
			ret.add(sc);
		}
		
		return ret;
	}

	@Override
	public List queryByTeacherNo(String teacherNo) {
		// TODO Auto-generated method stub
		CurriculumDAO dao = CurriculumDAOFactory.getDaoInstance();
		List tmp = dao.queryByTeacherNo(teacherNo);
		List ret = null;
		Iterator it = tmp.iterator();
		if (it.hasNext()) {
			ret = new ArrayList<StudentCurriculum>();
		}
		while (it.hasNext()) {
			Curriculum cr = (Curriculum)it.next();
			TeacherService ts = TeacherServiceFactory.getDaoInstance();
			Teacher t = ts.queryByTeacherNo(cr.getTeacherNo());
			CourseService cs = CourseServiceFactory.getDaoInstance();
			Course c = cs.queryByCourseId(cr.getCourseNo());
			TeacherCurriculum sc = new TeacherCurriculum();
			sc.setClassNo(cr.getClassNo());
			sc.setClassroom(cr.getClassroom());
			sc.setCourseName(c.getCourseName());
			sc.setEndClass(cr.getEndClass());
			sc.setStartClass(cr.getStartClass());
			sc.setEndWeek(cr.getEndWeek());
			sc.setStartWeek(cr.getStartWeek());
			sc.setTermNo(cr.getTermNo());
			ret.add(sc);
		}
		
		return ret;
	}

}
