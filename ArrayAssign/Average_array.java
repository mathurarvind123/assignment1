package ArrayAssign;

import java.util.Scanner;

public class Average_array {
   public static void main(String[] args)   {  
	      Scanner sc = new Scanner(System.in); // creating scanner class
	      System.out.println("Enter Array length: "); // to define array index
			int length = sc.nextInt();
			int arr[] =new int[length];
	      System.out.println("Enter "+length+" numbers of array one by one:"); // to declare array numbers
	      int Arr[] = new int [5];
	      // for contiguous array
	      for(int i =0; i<length; i++){
	         Arr[i] = sc.nextInt();
	      }
	      //logic for average
	      float avg = 0; // temp variable
	      for(int i =0; i<length; i++){
	         avg = avg + Arr[i];
	      }
	      avg = avg/length;
	      System.out.println("Average of array numbers is : "+avg);
	   }
	}



