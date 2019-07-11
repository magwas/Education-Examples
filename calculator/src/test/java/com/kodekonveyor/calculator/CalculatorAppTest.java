package com.kodekonveyor.calculator;

import org.junit.jupiter.api.Test;

class CalculatorAppTest {

	@Test
	void main_runs() {
		String[] argv = new String[] {"3","5"};
		CalculatorApp.main(argv);
	}

}
