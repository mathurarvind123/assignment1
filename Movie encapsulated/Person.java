package assignment;

public class Person {
	// instance variable
		private String name; 
		private int age;
		// parameterized constructor
		Person(String n,int a){
			this.name=n; 
			this.age=a;
			
		//	System.out.println("Name is: "+name+"  Age is: "+age);
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
		}
}
