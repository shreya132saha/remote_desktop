package com.acc.lkm.abstractiondemo;
import java.util.Date;
public class Project extends Department {

	public Project(String dept_name) {
		super(dept_name);
		// TODO Auto-generated constructor stub
	}

	@Override
	Date delivery_date(Date date) {
		// TODO Auto-generated method stub
		return date;
	}
}