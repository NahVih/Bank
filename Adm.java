
public class Adm extends Employee {
	
	private int password;
	
	public boolean autentication(int password) {
		if(this.password == password) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public double getBonus() {
		return getSalary() * 0.1;		
	}

}
