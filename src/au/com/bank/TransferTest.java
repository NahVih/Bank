package au.com.bank;
public class TransferTest {

	public static void main(String[] args) {
		Account accountPaulo = new Account(1262, 285796);
		accountPaulo.deposit(50);
		accountPaulo.withdraw(20);
		
		System.out.println(accountPaulo.getBalance());
		Account accountMarcela = new Account(3047, 758465);
		System.out.println("The balance is " + accountMarcela.getBalance());
		
		PremiumAccount accountNatascha = new PremiumAccount(3047, 758465);
		accountNatascha.deposit(500);
		System.out.println("The balance is " + accountNatascha.getBalance());
		accountNatascha.transfer(50, accountMarcela);
		System.out.println("The balance is " + accountNatascha.getBalance());
		accountNatascha.withdraw(20);
		System.out.println("The balance is " + accountNatascha.getBalance());
		
		
		accountMarcela.transfer(300, accountPaulo);
		
		
	}
}
