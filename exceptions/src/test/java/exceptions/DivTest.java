package exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DivTest {
	
	private Calculator calculator = new Calculator();

	@Test
	public void div_throws_exception_on_division_by_zero() {
		assertThrows(ArithmeticException.class, () -> calculator.div(3, 0));
	}
	
	@Test
	public void safe_div_returns_null_on_division_by_zero() {
		assertEquals(null, calculator.safeDiv(3, 0));
	}
}
