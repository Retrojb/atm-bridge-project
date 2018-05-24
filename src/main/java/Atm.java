import java.math.BigDecimal;

public class Atm {
	private String requiredPin;
	private BigDecimal balance;
	
	public Atm(String pin, BigDecimal balance) {
		requiredPin = pin;
		this.balance = balance;
	}

	public boolean isAllowedAccess(String pin) {
		if (!pin.equals(requiredPin)) {
			return false;
		}
		return true;
	}

	public BigDecimal deposit(BigDecimal amount) {
		balance.add(amount);
		return balance;
	}
}
