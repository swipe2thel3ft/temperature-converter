package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

  static double[] celsiusValues = {-40, 0, 100, 37.1};
  static double[] expectedFahrenheitValues = {-40, 32, 212, 98.78};
  static final double TOLERANCE = 0.0001;

  static final double[][] temperaturePairs = {
      {-40, -40},
      {0, 32},
      {100, 212},
      {37.1, 98.78}
  };

  @Test
  void convertC2F() {
    for (double[] testCase : temperaturePairs) {
      double celsius = testCase[0];
      double expectedFahrenheit = testCase[1];
      double actualFahrenheit = Converter.convertC2F(celsius);
      assertEquals(expectedFahrenheit, actualFahrenheit, TOLERANCE);
    }
  }

  @Test
  void convertF2C() {
    //TODO Implement the Fahrenheit-to-Celsius conversion.
    for (double[] testCase : temperaturePairs) {
      double fahrenheit  = testCase[1];
      double expectedCelsius = testCase[0];
      double actualCelsius = Converter.convertF2C(fahrenheit);
      assertEquals(expectedCelsius, actualCelsius, TOLERANCE);
    }
  }
}