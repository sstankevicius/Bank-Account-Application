package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking chacc1 = new Checking("Simonas Stankevicius", "12375823845", 1500);
		
		Savings svacc1 = new Savings("Rokas AHasdasd", "124663456", 2500);
		
		chacc1.showInfo();
		
		System.out.println("\n*************************************************\n");
		
		svacc1.showInfo();
		
		// Read a CSV file the create new Accounts based on that data

	}

}
