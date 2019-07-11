import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FieldsAndMoreTypesTest {

	String myText = "hello";

	@Test
	void char_holds_a_single_letter() {
		char myCharacter = 'a';
		assertEquals('a',myCharacter);
	}

	@Test
	void String_holds_a_text() {
		assertEquals("hello", myText);
	}

	@Test
	void String_has_methods() {
		assertEquals('h', myText.charAt(0));
	}

}
