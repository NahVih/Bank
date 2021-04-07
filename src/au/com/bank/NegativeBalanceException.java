package au.com.bank;

public class NegativeBalanceException extends RuntimeException {
	public NegativeBalanceException(String msg) {
		super(msg);
	}
}
 