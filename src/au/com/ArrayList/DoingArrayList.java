package au.com.ArrayList;

import java.util.ArrayList;

import au.com.bank.Account;
import au.com.bank.Client;
import au.com.bank.PlatinumAccount.PlatinumAccount;


public class DoingArrayList {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		Account c1 = new PlatinumAccount(1245, 999881);
		Client accountNamePaulo = new Client();
		c1.setCustomer(accountNamePaulo);
		accountNamePaulo.setName("Paulo Silveira");
		list.add(c1);
		
		Account c2 = new PlatinumAccount(6542, 881991);
		Client accountNameNatascha = new Client();
		c2.setCustomer(accountNameNatascha);
		accountNameNatascha.setName("Natascha Baptista");
		list.add(c2);
		
	
		System.out.println(list.size());
		System.out.println(c2.getBranch());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	
		}
		
		for(Object ref : list) {
			System.out.println(ref);	
		}
		
	}

}
