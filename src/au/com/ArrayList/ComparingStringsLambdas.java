package au.com.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

import au.com.bank.Account;
import au.com.bank.Client;
import au.com.bank.PlatinumAccount.PlatinumAccount;

public class ComparingStringsLambdas {
	
	public static void main(String[] args) {
		ArrayList<Account> list = new ArrayList<Account>();
		//LinkedList<Account> list = new LinkedList<Account>();
		
		Account c1 = new PlatinumAccount(1245, 119981);
		Client accountNamePaulo = new Client();
		c1.setCustomer(accountNamePaulo);
		accountNamePaulo.setName("Paulo Silveira");
		list.add(c1);
		
		Account c2 = new PlatinumAccount(6542, 881991);
		Client accountNameNatascha = new Client();
		c2.setCustomer(accountNameNatascha);
		accountNameNatascha.setName("Natascha Baptista");
		list.add(c2);
		
		Account c3 = new PlatinumAccount(3245, 773345);
		Client accountNameVittor = new Client();
		c3.setCustomer(accountNameVittor);
		accountNameVittor.setName("Salvador Baptista");
		list.add(c3);
		
		Account c4 = new PlatinumAccount(3425, 867799);
		Client accountNameVinicius = new Client();
		c4.setCustomer(accountNameVinicius);
		accountNameVinicius.setName("Vinicius Baptista");
		list.add(c4);
	
		System.out.println(list.size());
		System.out.println(c2.getBranch());


		for(Account accountTotal : list) {
			System.out.println(accountTotal);	
		}
		
		System.out.println("Organized:");
		
		list.sort((i1, i2) -> i1.getCustomer().getName().compareTo(i2.getCustomer().getName())
		);
		
		list.forEach( (Account) -> System.out.println(Account) );	
	}

}
