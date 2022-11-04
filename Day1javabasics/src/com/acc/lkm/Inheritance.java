package com.acc.lkm;

public class Inheritance {

	void training() {
		System.out.println("");
		
	}
	class student extends Inheritance{
}
	public static void main(String args[])
	{
		
	}
}

public class Student extends Trainer
{
	public static void main(String args[]) {
		Student student=new Student();
		Operation op=new Operation();
		op.record();
		op.training();
		op.learning(89);
		student.training();
	}
}


public class Operation extends Student{
	void record() {
		System.out.println(total);
	}
	
}