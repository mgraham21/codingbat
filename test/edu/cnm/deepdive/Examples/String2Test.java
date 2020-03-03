package edu.cnm.deepdive.Examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class String2Test {

  @Test
  void doubleChar() {
    String input = "Happy";
    String output = "HHaappppyy";
    assertEquals(output, String2.doubleChar(input));
  }
}