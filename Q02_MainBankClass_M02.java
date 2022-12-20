 package com.velocity.assignment12;
// Main Class 
public class Q02_MainBankClass_M02 {

	public static void main(String[] args) {
		
		// Create an Object of HDFC Bank
		Q02_HDFCBank_C02 hdfcBank = new Q02_HDFCBank_C02();
		
		hdfcBank.getHDFCDetails(); // Call HDFC Bank Method By HDFC Bank Class Object
		
		// Create an Object of ICICI Bank
		Q02_ICICIBank_C02 iciciBank = new Q02_ICICIBank_C02();
		
		iciciBank.getICICIBankDetails(); // Call ICICI Bank Method By ICICI Bank Class Object
		
		// Create an Object of SBI Bank
		Q02_SBIBank_C02 sbiBank = new Q02_SBIBank_C02();
		
		sbiBank.getSBIBankDetails(); // Call SBI Bank Method By SBI Bank Class Object
		
	}

}
