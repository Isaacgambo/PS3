import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
Account acc;
	@Before
	public void setUp() throws Exception {
		acc = new Account(1122, 20000);
	}

	@After
	public void tearDown() throws Exception {
		acc = null;
	}

	@Test
	public void testDeposit() {
		acc.deposit(500);
		assertTrue("the balance is not equal to 500.00", acc.getBalance()==20500.00);
	}
	@Test (expected = InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
			acc.deposit(500.00);
			assertEquals("$400.00 expected, actual is $500.00", (double)acc.getBalance(), (long) 500.00);
		acc.withdraw(900);
	}
	
}
