package com.hs.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hs.Curriculum;
import com.hs.CurriculumService;
import com.hs.CurriculumServiceFactory;
import com.hs.Student;
import com.hs.StudentService;
import com.hs.StudentServiceFactory;
import com.hs.Teacher;
import com.hs.TeacherService;
import com.hs.TeacherServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class AddOneCurriculumAction extends ActionSupport {

	private String listNo = "";
	private String termNo = "";
	private String teacherNo = "";
	private String classNo = "";
	private String classroom = "";
	private String courseNo = "";
	private String startWeek = "";
	private String endWeek = "";
	private String startClass = "";
	private String endClass = "";
	
	public String getListNo() {
		return listNo;
	}
	public void setListNo(String listNo) {
		this.listNo = listNo;
	}
	
	public String getTermNo() {
		return termNo;
	}
	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String techerNo) {
		this.teacherNo = techerNo;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public String getStartWeek() {
		return startWeek;
	}
	public void setStartWeek(String startWeek) {
		this.startWeek = startWeek;
	}
	public String getEndWeek() {
		return endWeek;
	}
	public void setEndWeek(String endWeek) {
		this.endWeek = endWeek;
	}
	public String getStartClass() {
		return startClass;
	}
	public void setStartClass(String startClass) {
		this.startClass = startClass;
	}
	public String getEndClass() {
		return endClass;
	}
	public void setEndClass(String endClass) {
		this.endClass = endClass;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public String execute () {
		HttpSession session = ServletActionContext.getRequest().getSession();
		/**
		 * Get attribute of this session
		 */
		String user_type = null;
		user_type = (String)session.getAttribute("utype");
		System.out.println("[Test]user_type=" + user_type);
		
		String ret = "";
		
		if (user_type != null) {
			if (user_type.equals("admin")) {
				CurriculumService crsvs = CurriculumServiceFactory.getDaoInstance();
				Curriculum cr = new Curriculum();
				cr.setClassNo(classNo);
				cr.setClassroom(classroom);
				cr.setCourseNo(courseNo);
				cr.setEndClass(endClass);
				cr.setEndWeek(endWeek);
				cr.setListNo(listNo);
				cr.setStartClass(startClass);
				cr.setStartWeek(startWeek);
				cr.setTeacherNo(teacherNo);
				cr.setTermNo(termNo);
				crsvs.addCurriculum(cr);

				List crl = crsvs.queryAllCurriculum();
				ServletActionContext.getRequest().setAttribute("cr_info", crl);
				
				ret = "succ";
			}
			else {
				ret = "error";
			}
		}
		else {
			ret = "login_first";
		}
		return ret;
	}
}
