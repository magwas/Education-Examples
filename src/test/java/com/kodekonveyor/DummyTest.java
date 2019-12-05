package com.kodekonveyor;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DummyTest {

  @Test
  @DisplayName(
    "This test is here only make you aple to run the tests when you download the project." +
        "Neither it, nor the associated production code does anything interesting."
  )
  void test() {
    assertTrue(DummyUtil.areYouThere());
  }

}
