package thread;

public class Thread_ques1 extends Thread {
	
		public void run() {	
			System.out.println("Thread 1 : ");
			System.out.println("10 x 2 = "+10*2);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Thread 2 :");
			System.out.println("10/5= "+10/5);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		public static void main(String[] args) {
			// object decide the number of intervals
			Thread_ques1 t = new Thread_ques1();
			t.start(); // 1st interval
			try {
				t.join();		
			} 
			catch (InterruptedException e) {
				System.out.println(e);
			}

	}}
	