package inheritanceActivity;

public class InheritanceActivity {
	public static void main(String[] args) {
		//	test case 1
		Manager man=new Manager (126534,"Peter","Chennai India",237844,65000);
		man.calcluateSalary();
		man.calculatetransportAllowance();
		//	test case 2
		Trainee tra=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		tra.calcluateSalary();
		tra.calculatetransportAllowance();

	}
}

