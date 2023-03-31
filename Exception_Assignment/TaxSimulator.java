package Exception_Assignment;

import java.util.Scanner;

public class TaxSimulator {
	public static void main(String[] args) {
		// creating scanner class
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Employee Name :");
		String empName = in.next(); // for employee name
		System.out.println("Enter true if Indian either false :");
		boolean isIndian = in.nextBoolean(); // is employee Indian or not
		System.out.println("Enter Employee's salary :");
		double empSal = in.nextDouble(); // for employee sir 
		
		// 
		TaxCalculator tc = new TaxCalculator(); // object created for TaxCalculator 
		try { // try block for user input
			System.out.println(tc.caculateTax(empName, isIndian, empSal));
		}
		catch(Exception e) { // catch block for exception handling
			System.out.println(e);
		}
	}
}

