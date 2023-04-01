package DivisorSum;

import java.util.Scanner;

public class AdvancedAirthematic {
	void divisorSum() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num =in.nextInt();
		int j=0;
		if (num<1000) {
		
		for(int i=1; i<=1000; i++) {
		if (num % i==0) {
			j=j+i;
		}
	}
		System.out.println("The sum fo divisor is :");
		System.out.println(j);
}
		else {
			System.out.println("______ERROR______");
			System.out.println("Number should be less than 1000.");
		}
}}



