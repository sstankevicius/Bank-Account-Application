package bankaccountapp;

public class Checking extends Account {
	
	// List the properties specific to checking account
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialise checking account properties
	
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	// List any methods specific to the checking account
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Checking Account Features:" +
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card Pin: " + debitCardPIN
				);
	}
}
