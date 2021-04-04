
public class PremiumAccount extends Account {
	public PremiumAccount(int branch, int number) {
		super(branch, number);
	}
	
	@Override
	public void withdraw(double value) {
		super.withdraw(value +0.2);
	}
}
