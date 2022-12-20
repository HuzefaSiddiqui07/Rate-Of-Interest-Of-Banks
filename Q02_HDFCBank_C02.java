package com.velocity.assignment12;

import java.util.Scanner;
// Child Class 01
public class Q02_HDFCBank_C02 extends Q02_Bank_P02{
	
	// Create a Method 
	public void getHDFCDetails() {
		
		// Create Scanner Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details for HDFC bank >>> ");
		
		System.out.println("Principle Amount");
		principleAmount = sc.nextDouble();
		
		System.out.println("Tenure");
		tenure = sc.nextInt();
		
		System.out.println("Rate of interest");
		rateOfInterest = sc.nextFloat();
		
		System.out.println("Simple interest for HDFC bank >> " + getCalculateInterest (principleAmount, tenure, rateOfInterest ));
		
	}
	public double getCalculateInterest (double principleAmount, int tenure, double rateOfInterest) {
		
		return (principleAmount * tenure * rateOfInterest / 100);
	}

}
