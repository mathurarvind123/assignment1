package assignment;
abstract class BankAccount {
	long account_no=12345678;
	double balance=10000;
	// abstract method
	abstract void deposit();
	abstract void withdraw();
	void show() {
		System.out.println("Account number: "+account_no);
		System.out.println("Balance : Rs."+balance);
	}
}
class CheckingAmount extends BankAccount {
	@Override
	void deposit() {
		int deposit=1000;
		System.out.println("New Balance: Rs."+(balance+deposit));
	}
	@Override	
	void withdraw() {
		int withdraw=3000;
		System.out.println("New Balance: Rs. "+(balance-withdraw));	
	}	
}
public class Bank_Abstraction {
public static void main(String[] args) {
	CheckingAmount data=new CheckingAmount();
	data.show();
	data.deposit();
	data.withdraw();
}
}

