
public class TestClient {
	public static void main(String[] args) {
		Account accountMarcela = new Account(1247, 157986);
		Client clientMarcela = new Client();
		clientMarcela.setName("Marcela");
		
		accountMarcela.setCustomerName(clientMarcela);
		
		System.out.println(accountMarcela.getCustomerName());
		System.out.println(clientMarcela.getName());
		System.out.println(accountMarcela.getCustomerName().getName());
		
		Account accountPaulo = new Account(1475, 698534);
		accountPaulo.setCustomerName(new Client());
		accountPaulo.getCustomerName().setName("Paulo");
		System.out.println(accountPaulo.getCustomerName().getName());

	}

}
