package assignment;
interface BankAccount1 { // base class
	
	void deposit(); // abstract method 1
	void withdraw(); // abstract method 2
}
class CheckingAmount1 implements BankAccount1 {  //  sub class	implements interface
	@Override
	public void deposit() {
		System.out.println("Depositing money in bank account.");	
	}
	@Override
	public void withdraw() {
		System.out.println("Withdrawing money from bank account.");
	}
}
public class Bank_interface { // main class
	public static void main(String[] args) {
		CheckingAmount1 data=new CheckingAmount1(); // object created for sub class
		data.deposit();
		data.withdraw();
}
}