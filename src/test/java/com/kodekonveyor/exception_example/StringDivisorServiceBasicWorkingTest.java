package com.kodekonveyor.exception_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
public class StringDivisorServiceBasicWorkingTest extends StringDivisorServiceTestBase {

  @Test
  @DisplayName(
    "a string with two numbers will result in the dividend of those two numbers"
  )
  void test2() {
    assertEquals(
        StringDivisorServiceTestData.RESULT,
        stringDivisorService.call(StringDivisorServiceTestData.DIVISION)
    );
  }

  @Test
  @DisplayName(
    "if the divisor is zero, 'division by zero' is returned"
  )
  void test3() {
    assertEquals(
        "division by zero",
        stringDivisorService.call(StringDivisorServiceTestData.DIVISION_BY_ZERO)
    );
  }

  @Test
  @DisplayName(
    "if there are not enough parameters, 'error parsing expression' is returned"
  )
  void test4() {
    assertEquals(
        "error parsing expression",
        stringDivisorService
            .call(StringDivisorServiceTestData.DIVISION_WITH_TOO_FEW_PARAMETERS)
    );
  }

  @Test
  @DisplayName(
    "if a parameter cannot be parsed, 'error parsing expression' is returned"
  )
  void test5() {
    assertEquals(
        "error parsing expression",
        stringDivisorService
            .call(StringDivisorServiceTestData.DIVISION_WITH_NONNUMBER)
    );
  }

}
