package com.kodekonveyor.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculatorTest {

	@Test
	void add_adds_two_numbers() {
		Calculator myCalculator = new Calculator();
		assertEquals(5, myCalculator.add(3,2));
	}

	@Test
	void add_adds_two_numbers_when_they_are_give_as_string_array() {
		Calculator myCalculator = new Calculator();
		String[] parameters = {"3","2"};
		assertEquals("5", myCalculator.add(parameters));
	}

	@Test
	void div_divides_two_numbers() {
		Calculator myCalculator = new Calculator();
		assertEquals(2, myCalculator.div(4,2));
	}

	@Test
	void div_divides_two_numbers_when_they_are_give_as_string_array() {
		Calculator myCalculator = new Calculator();
		String[] parameters = {"4","2"};
		assertEquals("2", myCalculator.div(parameters));
	}
	@Test
	void if_we_divide_by_zero_the_result_contains_a_message() {
		Calculator myCalculator = new Calculator();
		String[] parameters = {"3","0"};
		assertEquals("Division by zero", myCalculator.div(parameters));
	}

}
