package com.kodekonveyor.exception_example;

import org.springframework.stereotype.Service;

@Service
public class DividerService {

  public Long call(final Long dividend, final Long divisor) {
    if (divisor < 0)
      throw new IAmTooPickyToDivideByNegativeNumberException("I am too picky!");
    return dividend / divisor;
  }

}
