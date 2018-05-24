import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest {
	Atm atm = new Atm("5678", new BigDecimal(100.0));
	
	@Test
	public void shouldReturnTrueWhenPinsMatch() {
		boolean underTest = atm.isAllowedAccess("5678");
		
		Assert.assertEquals(true, underTest);
	}
	
	@Test
	public void shouldReturnFalseWhenPinsDontMatch() {
		boolean underTest = atm.isAllowedAccess("1234");
		
		Assert.assertEquals(false, underTest);
	}
	
	@Test
	public void shouldIncreaseBalance() {
		BigDecimal underTest = atm.deposit(new BigDecimal(50.0));
		
		BigDecimal depositAmount = new BigDecimal(150.0);
		
		Assert.assertEquals(depositAmount, underTest);
	}
}
