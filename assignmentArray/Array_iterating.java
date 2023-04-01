package assignmentArray;

public class Array_iterating {
	public static void main(String[] args) {
		// Initializing & declaring array
		   int[] array = {25,15,45,60,80,56,77,98,129,149}; 
		   int[] new_array = new int[array.length]; // declaring index for new array
		   
		   System.out.println("Predefined Array : "); // predefined array
		   for(int i=0; i < array.length; i++) {
		   System.out.print(array[i]+" ");
		   }
		   
		   System.out.println( );//for new line
		   
		   System.out.println("New Array after iterating/copy predefined array: "); // iterating the predefined array 
		   for(int i=0; i < array.length; i++) {
		    new_array[i] = array[i];
		   System.out.print(new_array[i]+" ");
		 }
		 }}



