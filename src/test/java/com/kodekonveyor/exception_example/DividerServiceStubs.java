package com.kodekonveyor.exception_example;

import org.mockito.Mockito;

public class DividerServiceStubs {

  public static void behaviour(final DividerService dividerService) {
    Mockito.when(
        dividerService
            .call(
                DividerServiceTestData.DIVIDEND, DividerServiceTestData.DIVISOR
            )
    ).thenReturn(DividerServiceTestData.RESULT);
    Mockito.when(
        dividerService
            .call(
                DividerServiceTestData.DIVIDEND, DividerServiceTestData.ZERO
            )
    ).thenThrow(ArithmeticException.class);
  }

}
