public class Atm {
	private String requiredPin;
	
	public Atm(String pin) {
		requiredPin = pin;
	}

	public boolean isAllowedAccess(String pin) {
		if (!pin.equals(requiredPin)) {
			return false;
		}
		return true;
	}
}
