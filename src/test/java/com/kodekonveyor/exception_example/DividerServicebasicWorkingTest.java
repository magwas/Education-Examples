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

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;
import com.kodekonveyor.exception.ThrowableTester;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
@TestedBehaviour("basic working")
@TestedService("DividerService")
public class DividerServicebasicWorkingTest extends DividerServiceTestBase {

  @Test
  @DisplayName("The divider service divides two numbers")
  void test1() {
    assertEquals(
        DividerServiceTestData.RESULT,
        dividerService.call(
            DividerServiceTestData.DIVIDEND, DividerServiceTestData.DIVISOR
        )
    );
  }

  @Test
  @DisplayName("Division by zero throws an exception")
  void test2() {
    final ThrowableTester tester = new ThrowableTester();
    tester.assertThrows(
        () -> dividerService
            .call(DividerServiceTestData.DIVIDEND, DividerServiceTestData.ZERO)
    )
        .assertException(ArithmeticException.class);
  }

  @Test
  @DisplayName("Division by zero error message is '/ by zero'")
  void test21() {
    final ThrowableTester tester = new ThrowableTester();
    tester.assertThrows(
        () -> dividerService
            .call(DividerServiceTestData.DIVIDEND, DividerServiceTestData.ZERO)
    )
        .assertMessageIs(DividerServiceTestData.BY_ZERO);
  }

  @Test
  @DisplayName("We refuse to divide by a negative number")
  void test3() {
    final ThrowableTester tester = new ThrowableTester();
    tester.assertThrows(
        () -> dividerService.call(
            DividerServiceTestData.DIVIDEND,
            DividerServiceTestData.NEGATIVE_DIVISOR
        )
    )
        .assertException(IAmTooPickyToDivideByNegativeNumberException.class);
  }

  @Test
  @DisplayName(
    "We refuse to divide by a negative number with the message: 'I am too picky!'"
  )
  void test4() {
    final ThrowableTester tester = new ThrowableTester();
    tester.assertThrows(
        () -> dividerService.call(
            DividerServiceTestData.DIVIDEND,
            DividerServiceTestData.NEGATIVE_DIVISOR
        )
    )
        .assertMessageIs(DividerServiceTestData.I_AM_TOO_PICKY);
  }

}
