package com.hs;

public class CurriculumDAOFactory {
	public static CurriculumDAO getDaoInstance() {
		return new CurriculumDAO();
	}
}
