package com.kodekonveyor.calculator;

public class Calculator {

	private Converter converter = new Converter();

	public int add(int i, int j) {
		return i+j;
	}

	public String add(String[] parameters) {
		int firstParameter = convert(parameters, 0);
		int secondParameter = convert(parameters,1);
		int result = add(firstParameter,secondParameter);
		String stringResult = convert(result);
		return stringResult;
	}


	public int div(int i, int j) {
		return i/j;
	}

	public String div(String[] parameters) {
		int firstParameter = convert(parameters, 0);
		int secondParameter = convert(parameters,1);
		int result;
		try {
		 result = div(firstParameter,secondParameter);
		} catch (ArithmeticException e){
			return "Division by zero";
		}
		String stringResult = converter .intToString(result);
		return stringResult;
	}

	private String convert(int result) {
		return converter.intToString(result);
	}

	private Integer convert(String[] parameters, int position) {
		Converter converter = new Converter();
		return converter.stringToInt(parameters[position]);
	}

}
