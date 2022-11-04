package com.acc.lkm;

public class StringBufferDemo {

	
	
		public static void main(String args[])
		{
			StringBuffer sb=new StringBuffer("Accenture");
			//sb.append(3,"Training");
			sb.insert(3," Training");
			sb.replace(2,5, "KDC");
			System.out.println(sb.reverse());
			sb.ensureCapacity(300);
			System.out.println(sb.capacity());
			sb.append("Java is my stream at KDC facility");
			System.out.println(sb);
			
		}

	

}
