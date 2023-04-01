package assignmentArray;

public class Array_duplicate {
public static void main(String[] args) {
		
		//	Initialize array & declaring array
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3}; 
		System.out.println("Array is :");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println(); // for new line
		
        System.out.println("Duplicate elements in given array are : ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  // i+1 to search in next sequence/index beside same one 
                if(arr[i] == arr[j])  
                    System.out.print(arr[j]+" ");  
	}

}}
}
