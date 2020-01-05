package com.kodekonveyor.exception_example;

public class IAmTooPickyToDivideByNegativeNumberException
    extends RuntimeException {

  private static final long serialVersionUID = 670815204188896686L;

  public IAmTooPickyToDivideByNegativeNumberException(final String string) {
    super(string);
  }

}
