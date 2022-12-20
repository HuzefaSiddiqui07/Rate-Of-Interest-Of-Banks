package com.velocity.assignment12;

import java.util.Scanner;
//Child Class 02
public class Q02_ICICIBank_C02 extends Q02_Bank_P02 {
	
	// Create Method
	public void getICICIBankDetails() {
		
		// Create Scanner Object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the details for ICICI bank >>>");
		
		System.out.println("Principle Amount");
		principleAmount = scan.nextDouble();
		
		System.out.println("Tenure");
		tenure = scan.nextInt();
		
		System.out.println("Rate of interest");
		rateOfInterest = scan.nextFloat();
		
		System.out.println("Simple interest for ICICI bank >> " + getCalculateInterest (principleAmount, tenure, rateOfInterest ));
		
	}
 public double getCalculateInterest (double principleAmount, int tenure, double rateOfInterest) {
		
		return (principleAmount * tenure * rateOfInterest / 100);
   }

 }
