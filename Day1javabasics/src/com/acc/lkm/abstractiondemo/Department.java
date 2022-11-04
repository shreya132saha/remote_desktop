package com.acc.lkm.abstractiondemo;
import java.util.Date;



public abstract class Department {
public Department(String dept_name)
{
	System.out.println(dept_name);
}
void requirement(int proj_id)
{
	System.out.println(proj_id);
}
abstract Date delivery_date(Date date);//abstract method




}



