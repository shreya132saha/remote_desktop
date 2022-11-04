package com.acc.lkm;

import javax.print.attribute.standard.RequestingUserName;


public class MethodOverriding {

	SBI sbi=new SBI();
	AXIS axis=new AXIS();
	HDFC hdfc=new HDFC();
	RBI rbi=new RBI();
	System.out.println("Rate of interest of SBI is:"+sbi.roi(7)+"\n"+"Rate of interest of HDFC is:"+sbi.roi(8)+"\n"+"Rate of interest of AXIS is:"+sbi.roi(9)+"\n"+)
}



public class HDFC extends RBI{
	int roi(int n);
	RequestingUserName name;
	
}


public class RBI{
	int roi(int n);
	RequestingUserName name;
	
}

public class SBI extends RBI{
	int roi(int n);
	RequestingUserName name;
	
}

public class AXIS extends RBI{
	int roi(int n);
	RequestingUserName name;
	
}