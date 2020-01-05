package com.kodekonveyor.exception_example;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class StringDivisorServiceTestBase {

  @Mock
  private DividerService dividerService;
  @InjectMocks
  protected StringDivisorService stringDivisorService;

  public StringDivisorServiceTestBase() {
    super();
  }

  @BeforeEach
  void setUp() {
    DividerServiceStubs.behaviour(dividerService);
  }

}
