
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTest {

	@Test
	void testTrue() {
		assertTrue(true);
	}

	@Test
	void testFalse() {
		assertFalse(false);
	}
	
	@Test
	void testEqualsNumber() {
		assertEquals(4,4);
	}

	@Test
	void testEqualsText() {
		assertEquals("Hello", "Hello");
	}

}
