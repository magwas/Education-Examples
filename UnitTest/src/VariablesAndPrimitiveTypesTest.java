import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VariablesAndPrimitiveTypesTest {

	@Test
	void a_booelan_holds_a_logical_value() {
		boolean aVariableHoldingALogicalValue = (2*2 == 5);
		assertEquals(false, aVariableHoldingALogicalValue);
	}

	@Test
	void an_int_holds_a_round_number() {
		int aVariableHoldingARoundNumber;
		aVariableHoldingARoundNumber = 3;
		assertEquals(3, aVariableHoldingARoundNumber);
	}

	@Test
	void a_double_holds_a_precise_variable() {
		double aVariableHoldingAPreciseNumber = 3.14;
		assertEquals(3.14,aVariableHoldingAPreciseNumber);
	}

}
