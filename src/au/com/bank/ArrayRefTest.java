package au.com.bank;

public class ArrayRefTest {

	public static void main(String[] args) {
		
		Account[] Accounts = new Account[2];

		Accounts[0] = new Account(1212, 1348);
		
		Account c2 = new Account(3232, 5534);
		Accounts[1] = c2;
		
		for (int i = 0; i < Accounts.length; i++) {
			System.out.println(Accounts[i].getNumber());	
		}
	

	}
	
}
