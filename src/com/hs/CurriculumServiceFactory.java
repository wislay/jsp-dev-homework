package com.hs;

public class CurriculumServiceFactory {
	public static CurriculumService getDaoInstance() {
		return new CurriculumService();
	}
}
