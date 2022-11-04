package com.acc.lkm.abstractiondemo;

import java.util.Date;

public class Abstraction {
	public static void main(String args[]) {
		Department dep=new Project("Java");
		System.out.println(dep.delivery_date(new Date()));
		dep.requirement(123);
	}
}
