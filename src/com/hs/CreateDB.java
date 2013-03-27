package com.hs;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateDB {

	/**
	 * Function to create db
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SchemaExport sExport = new SchemaExport(cfg);
		sExport.create(true, true);
	}

}
