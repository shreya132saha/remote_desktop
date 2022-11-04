package com.acc.lkm;
import java.lang.*;
import java.util.Scanner*;
public class ConstDemo {
static double Area, rad=7;
static final double pi=3.14;
double disp(double radius)
{
	rad=radius;
	Area=pi*Math.pow(rad, 2);
	//System.out.println("Area of the Circle:"+Area);
	return Area;
	
}
/*public ConstDemo(double radius)
{
	Area=pi*Math.pow(rad, 2);
	System.out.println("Area of the Circle:"+Area);
}*/

public static void main(String args[])
{
	//new ConstDemo(10);
	//ConstDemo const=new ConstDemo();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Radius");
	double rad=sc.nextDouble();
	Area=pi*Math.pow(rad, 2);
}
}
