
public class TestNewNumber {
	public static void main(String[] args) {
		Account accountPaulo = new Account(1242, 145789);
		System.out.println(accountPaulo.getNumber());
		
		Account accountPedro = new Account(1337, 24226);
		System.out.println("Your number is " + accountPaulo.getNumber() + "and your branch is " + accountPaulo.getBranch());
		System.out.println("Your number is " + accountPedro.getNumber() + "and your branch is " + accountPedro.getBranch());

	}
}
