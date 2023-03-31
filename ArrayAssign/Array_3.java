package ArrayAssign;

public class Array_3 {
	public static void main(String[] args) {
		// initialization,Declaration & instantiation
		String name[]= {"Mukul","Saurav","Tushar","Arvind","Kunal","Mayank","Shivam","Arav","Sunil","love"};
	/*	for (int i=0; i<name.length;i++) {
		System.out.println("Name of student: "+name[i]);				
		}*/
	// by for each loop	
		for (String i:name)
			System.out.println("Student name is: "+i);
			
