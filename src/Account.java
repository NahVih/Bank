public class Account {
	private double balance;
	private int branch;
	private int number;
	private Client customerName;
	private static int accountTotal;
	
	public Account(int branch, int number) {
		Account.accountTotal++;
		this.branch=branch;
		this.number=number;
		this.balance=0;
		System.out.println("The total of accounts is " + accountTotal);
	}
	
	public void deposit (double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		
		if(this.balance < value) {
			throw new NegativeBalanceException("Balance: " + this.balance + ", Value: " + value); //problem
		}
		this.balance -= value;
			
	}
	
	public void transfer (double value, Account destiny) {
		this.withdraw(value);
		destiny.deposit(value);
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}
	public Client getCustomerName() {
		return customerName;
	}
	public void setCustomerName(Client customerName) {
		this.customerName = customerName;
	}
	public static int getaccountTotal() {
		return Account.accountTotal;
	}
}