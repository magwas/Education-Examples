package com.kodekonveyor.exception_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringDivisorService {

  @Autowired
  DividerService dividerService;

  public String call(final String string) {
    try {
      final String[] splat = string.split(" ");
      final Long firstNumber = Long.parseLong(splat[0]);
      final Long secondNumber = Long.parseLong(splat[1]);
      return dividerService.call(firstNumber, secondNumber).toString();
    } catch (final ArithmeticException e) {
      return "division by zero";
    } catch (final ArrayIndexOutOfBoundsException | NumberFormatException e) {
      return "error parsing expression";
    }
  }

}
