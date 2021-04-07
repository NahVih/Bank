package au.com.bank.PlatinumAccount;

import au.com.bank.*;

public class PlatinumAccount extends Account {
	public PlatinumAccount(int branch, int number) {
		super(branch, number);
	}
	
	@Override
	public void withdraw(double value) {
		super.withdraw(value +1);
	}
	
	public double getBalance() {
		return super.balance;
	}
	
	@Override
	public String toString() {
		return "Platinum Account Number: " + super.getNumber() + " Client Name: "+ super.getCustomer().getName();
	}

}
