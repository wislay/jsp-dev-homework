package com.hs.action;
import java.util.*;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hs.Curriculum;
import com.hs.CurriculumService;
import com.hs.CurriculumServiceFactory;
import com.hs.User;
import com.hs.UserService;
import com.hs.UserServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class ShowOneCurriculumForEdit extends ActionSupport {

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
		HttpSession session = ServletActionContext.getRequest().getSession();
		/**
		 * Get attribute of this session
		 */
		String user_type = null;
		user_type = (String)session.getAttribute("utype");
		
		String ret = "";
		
		if (user_type != null) {
			if (user_type.equals("admin")) {
				CurriculumService crsvs = CurriculumServiceFactory.getDaoInstance();
				Curriculum cr = crsvs.queryByListNo(listNo);
				ServletActionContext.getRequest().setAttribute("one_cr", cr);
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
