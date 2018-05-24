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
	public void shouldIncreaseBalanceByFifty() {
		BigDecimal underTest = atm.deposit(new BigDecimal(50.0));
		
		BigDecimal expectedBankBalance = new BigDecimal(150.0);
		
		Assert.assertEquals(expectedBankBalance, underTest);
	}
	
	@Test
	public void shouldDecreaseBalanceByFifty() {
		BigDecimal underTest = atm.withdrawl(new BigDecimal(50.0));
		
		BigDecimal expectedBankBalance = new BigDecimal(50.0);
		
		Assert.assertEquals(expectedBankBalance, underTest);
	}
	@Test
	public void shouldDisplayCurrentBalance( ) {
		BigDecimal underTest = atm.balanceInquiry();
		BigDecimal expectedBankBalance = new BigDecimal(100.00);
		Assert.assertEquals(expectedBankBalance, underTest);
		
	}
}
