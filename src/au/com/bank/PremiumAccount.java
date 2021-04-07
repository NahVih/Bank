package au.com.bank;

public class PremiumAccount extends Account {
	public PremiumAccount(int branch, int number) {
		super(branch, number);
	}
	
	@Override
	public void withdraw(double value) {
		super.withdraw(value +0.2);
	}
	
	@Override
	public String toString() {
		return "Premium Account Number: " + super.getNumber() + " Client Name: "+ super.getCustomerName().getName();
	}
}
