package com.hs.action;

import java.util.*;

import org.apache.struts2.ServletActionContext;

import com.hs.CurriculumService;
import com.hs.CurriculumServiceFactory;
import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteOneCurriculumAction extends ActionSupport {

	private String listNo = "";

	public String getListNo() {
		return listNo;
	}

	public void setListNo(String listNo) {
		this.listNo = listNo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public String execute () {
		CurriculumService crsvs = CurriculumServiceFactory.getDaoInstance();
		crsvs.deleteCurriculum(listNo);
		List cr = crsvs.queryAllCurriculum();
		ServletActionContext.getRequest().setAttribute("cr_info", cr);
		String ret = "succ";
		return ret;
	}

}
