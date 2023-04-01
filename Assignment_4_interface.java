package assignment;


//  Ques 4
/*	Create an interface called "Person" with a method called "speak".
 *  Create two classes called "Student" and "Teacher" that implement the 
 *  Person interface and implement the "speak" method. Create objects of 
 *  both the Student and Teacher classes and call their respective "speak" methods.
 */

interface Person { // interface
	void speak();
}
class Student implements Person { // sub class Student
	@Override
	public void speak() {
		
		System.out.println("Student speaks to Teacher.");	
	}
}
class Teacher implements Person {	// sub class Teacher
	@Override
	public void speak() {
		System.out.println("Teacher speaks to students.");		
	}	
}
public class Assignment_4_interface { // main class
 public static void main(String[] args) {
	Person d=new Student(); // object for Student
	d.speak();
	Person d1=new Teacher(); // object for Teacher
	d1.speak();
}
}
