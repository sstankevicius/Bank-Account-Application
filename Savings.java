package bankaccountapp;

public class Savings extends Account {
	
	// List properties specific to the Savings account
	
	private int safetyDepositBoxID;
	private int safetyDepositKey;
	
	// Constructor to initialise settings for the Savings properties
	
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositKey = (int) (Math.random() * Math.pow(10, 3));
	}
	// List any methods specific to saving account
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
			" Your Savings Account Features:" +
			"\n Safety Deposit Box ID: " + safetyDepositBoxID +
			"\n Safety Deposit Key: " + safetyDepositKey
				);
	}
}

