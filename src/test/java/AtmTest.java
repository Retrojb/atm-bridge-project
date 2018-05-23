import org.junit.Assert;
import org.junit.Test;

public class AtmTest {
	Atm atm = new Atm("5678");
	
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
}
