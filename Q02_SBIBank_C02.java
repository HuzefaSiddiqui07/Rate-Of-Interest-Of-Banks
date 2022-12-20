package com.velocity.assignment12;

import java.util.Scanner;
//Child Class 03
public class Q02_SBIBank_C02 extends Q02_Bank_P02 {
	
	      // Create Method
		public void getSBIBankDetails() {
			
			// Create Scanner Object
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the details for SBI bank >>>");
			
			System.out.println("Principle Amount");
			principleAmount = scanner.nextDouble();
			
			System.out.println("Tenure");
			tenure = scanner.nextInt();
			
			System.out.println("Rate of interest");
			rateOfInterest = scanner.nextFloat();
			
			System.out.println("Simple interest for SBI bank >> " + getCalculateInterest (principleAmount, tenure, rateOfInterest ));
			
		}
	 public double getCalculateInterest (double principleAmount, int tenure, double rateOfInterest) {
			
			return (principleAmount * tenure * rateOfInterest / 100);
	   }

	

}
