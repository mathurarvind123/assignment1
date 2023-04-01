package thread;

public class Thread_Sample extends Thread {

		public void run() {	
			System.out.println("Thread 1 : ");
			String g ="Raghav";
			System.out.println("Employe name : "+g);	
			System.out.println("Thread 2 :");
			int sal = 20000;
			System.out.println("Employee salary :Rs."+sal);
			System.out.println("Employee salary after tax deduction :Rs."+(sal-1500));
		}
		public static void main(String[] args) {
			// object decide the number of intervals
			Thread_Sample to = new Thread_Sample();
			to.start(); 

	}}



