package au.com.bank;

public class TestClient {
	public static void main(String[] args) {
		Account accountMarcela = new Account(1247, 157986);
		Client clientMarcela = new Client();
		clientMarcela.setName("Marcela");
		
		accountMarcela.setCustomer(clientMarcela);
		
		System.out.println(accountMarcela.getCustomer());
		System.out.println(clientMarcela.getName());
		System.out.println(accountMarcela.getCustomer().getName());
		
		Account accountPaulo = new Account(1475, 698534);
		accountPaulo.setCustomer(new Client());
		accountPaulo.getCustomer().setName("Paulo");
		System.out.println(accountPaulo.getCustomer().getName());

	}

}
