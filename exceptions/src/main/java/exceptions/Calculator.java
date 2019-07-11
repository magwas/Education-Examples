package exceptions;

public class Calculator {

	public Integer div(Integer a, Integer b) {
		return a / b;
	}

	public Integer safeDiv(Integer a, Integer b) {
		Integer result;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			result = null;
		}
		return result;
	}
}
