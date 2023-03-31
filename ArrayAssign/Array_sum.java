package ArrayAssign;

import java.util.Scanner;
public class Array_sum {

	public static void main(String[] args)   {  
	      Scanner sc = new Scanner(System.in); // creating scanner class
	      System.out.println("Enter Array length: "); // to define array index
			int length = sc.nextInt();
			int arr[] =new int[length];
	      System.out.println("Enter "+length+" numbers of array one by one:"); // to declare array numbers
	      int myArray[] = new int [length];
	      int sum = 0; // temp variable
	   // for contiguous array
	      for(int i=0; i<length; i++){
	         myArray[i] = sc.nextInt();
	         // logic for sum
	         sum = sum + myArray[i];
	      }
	      System.out.println("Sum of the elements of the array : "+sum);
	   }
	
}
