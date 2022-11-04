package com.acc.lkm.keywords;

public class ThisDemo {
	int EID;
	String enterprise_id;
	String name;
	/*void display(int eid, String entid)
	{
		//EID=id;
		//enterprise_id=entid;
		this.EID=12345;
		this.enterprise_id=entid;
		System.out.println(EID+"\n"+enterprise_id);
	}*/
	
	
	public ThisDemo(int eid, String enterprise_id)
	{
		this.EID=eid;
		this.enterprise_id=enterprise_id;
		System.out.println(EID+"\n"+enterprise_id);
	}

	public ThisDemo(int eid, String enterprise_id, String n)
	{
		this.EID=eid;
		this.enterprise_id=enterprise_id;
		this.name=n;
		System.out.println(EID+"\n"+enterprise_id +"\n"+name);
	}
	void set()
	{
		System.out.println("hello");
	}
	void get()
	{
		this.set();
	}
}
