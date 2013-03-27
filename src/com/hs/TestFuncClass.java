package com.hs;
import java.io.UnsupportedEncodingException;
import java.util.*;
import com.hs.User;

public class TestFuncClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentService svs = StudentServiceFactory.getDaoInstance();
		
//		svs.deleteStudent("09211900");
//		
//		List ret = svs.queryAllStudent();
//		Iterator it = ret.iterator();
//		
//		while (it.hasNext()) {
//			Student u = (Student)it.next();
//			u.print_attr();
//		String id = "﻿09211002";
//		Student stu = svs.queryByStudentNo(id);
//		if (null == stu) {
//			System.out.println("No student");
//		}
//		else {
//			stu.print_attr();
//		}
//			try {
//				String part1 = new String(u.getStudentNo().getBytes("utf8"));
//				String part2 = new String(u.getStudentName().getBytes("gbk"));
//				String part3 = new String(u.getStudentEmail().getBytes("GBK"));
//				System.out.println(part1 + "\t" + part2 + "\t" + part3);
//			}
//			catch (Exception ex) {
//				System.out.println("Error when parse encode!");
//			}
//		}
//		UserDAO dao = UserDAOFactory.getDaoInstance();
//		User u = dao.queryById("09211552");
//		System.out.println(u.getId() + "\t" + u.getUname() + "\t" + u.getUtype());
		
//		CurriculumService cs = CurriculumServiceFactory.getDaoInstance();
//		List ret = cs.queryByStudenNoInClass("1315");
//		Iterator it = ret.iterator();
//		while (it.hasNext()) {
//			StudentCurriculum st = (StudentCurriculum)it.next();
//			st.print_attr();
//		}
		
		CurriculumService cs = CurriculumServiceFactory.getDaoInstance();
		List ret = cs.queryByTeacherNo("201309");
		Iterator it = ret.iterator();
		while (it.hasNext()) {
			TeacherCurriculum st = (TeacherCurriculum)it.next();
			st.print_attr();
		}
		
//		CourseService cs = CourseServiceFactory.getDaoInstance();
//		Course c = cs.queryByCourseId("C1");
//		if (null == c) {
//			System.out.println("Null!!!");
//		}
//		else {
//			System.out.println("courseId=" + c.getCourseId() + " courseName=" + c.getCourseName());
//		}
		
//		TeacherService ts = TeacherServiceFactory.getDaoInstance();
//		
//		String tno = "201304";
//		Teacher t = ts.queryByTeacherNo(tno);
//		if (null == t) {
//			System.out.println("Null!!!");
//		}
//		else {
//			System.out.println("TeacherName=" + t.getTeacherName());
//		}
//		
//		TeacherService ts = TeacherServiceFactory.getDaoInstance();
//		List tmp = ts.queryAllTeacher();
//		Iterator it = tmp.iterator();
//		
//		while (it.hasNext()) {
//			Teacher t = (Teacher)it.next();
//			System.out.println("TeacherName=" + t.getTeacherName());
//		}
	}

}
