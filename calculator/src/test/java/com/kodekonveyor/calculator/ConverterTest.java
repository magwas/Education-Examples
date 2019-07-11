package com.kodekonveyor.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

	@Test
	void intToString_converts_an_int_to_String() {
		Converter myConverter = new Converter();
		assertEquals("3", myConverter.intToString(3));
	}

	@Test
	void stringToInt_convert_a_string_to_int() {
		Converter myConverter = new Converter();
		assertEquals(3, myConverter.stringToInt("3"));
	}

}
