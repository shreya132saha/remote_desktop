package com.acc.lkm;

import java.util.Scanner;

public class Encapsulation {

	private int OTP, CVV;
	String CardHolder;
	private int getOTP() {
		return OTP;
	}
	private void setOTP(int oTP) {
		OTP = oTP;
	}
	private int getCVV() {
		return CVV;
	}
	private void setCVV(int cVV) {
		CVV = cVV;
	}
	private String getCardHolder() {
		return CardHolder;
	}
	private void setCardHolder(String cardHolder) {
		CardHolder = cardHolder;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Encapsulation encap=new Encapsulation();
		System.out.println("Enter the OTP");
		int otp=sc.nextInt();
		System.out.println("Enter the CVV");
		int cvv=sc.nextInt();
		System.out.println("Enter the CardHolder");
		String name=sc.next();
		encap.setCardHolder(name);
		encap.setCVV(cvv);
		encap.setOTP(otp);
		System.out.println("CardHolder is"+encap.getCardHolder()+"\n"+"Ypur OTP is:"+encap.getOTP()+"\n"+"CVV is"+encap.getCVV());
	}
}
