package assignmentArray;

import java.util.Scanner;

public class Array_replacement {
	  public static void main(String[] args)    {
	    	// creating scanner class
	        Scanner in=new Scanner(System.in);
	        System.out.println("Enter the number of elements :");
	        int length=in.nextInt();    //Array Size Initialization	        
	        int arr[]=new int[length];    //Array Declaration
	        System.out.println("Enter the elements of the array :");
	        for(int i=0;i<length;i++)  {   //Array Initialization
	        
	            arr[i]=in.nextInt();
	        }
	        // to remove number from java
	        System.out.println("Enter the number to be remove: ");
	        int e = in.nextInt();
	    
	        for (int i = 0; i < arr.length; i++)   {
	        	if(arr[i] == e) {  //If element found 	
	        		for(int j = i; j < arr.length - 1; j++) {	  // to replace number by another sequential number  ; arr.length-1 = the array is decreased by one element    
	            arr[j] = arr[j+1]; // number incremented   
	        }
	      }
	    }	      
	       System.out.println("After removing number array is: " );
	       for(int i = 0; i < arr.length-1; i++) { // for new array after removing number
	             System.out.print(arr[i]+ " ");
	       }  
	    }
	}
