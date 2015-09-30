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
		assertTrue("the balance is not correct after the deposit", acc.getBalance()==20500.00);
	}
	@Test (expected = InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		acc.withdraw(900);
		assertEquals("Not the expected balance after the withdrawl", (long)acc.getBalance(), (long) 19100);
		acc.withdraw(90000);
	}
}
