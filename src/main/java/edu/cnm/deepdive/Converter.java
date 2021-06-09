package edu.cnm.deepdive;

import java.util.Scanner;

public class Converter {

  private static final String INPUT_PROMPT = "Please type a celsius temperature (blank to quit): ";
  private static final String FAHRENHEIT_OUTPUT_FORMAT = "Fahrenheit temperature: %,.2f degrees%nPlease type a Celsius temperature (blank to quit):";
  private static final String PARSE_EXCEPTION_FORMAT = "Unable to parse \"%s\". Please try again: ";
  private static final double FAHRENHEIT_PER_CELSIUS = 9.0/ 5;
  private static final int FAHRENHEIT_FREEZING_POINT = 32;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(INPUT_PROMPT);
    String userInput = scanner.nextLine().trim();
    while (!userInput.isEmpty()) {
      try {
        //TODO check last character of userInput; if 'f' treat as Fahrenheit; otherwise, celsius
        System.out.printf(FAHRENHEIT_OUTPUT_FORMAT, convertC2F(Double.parseDouble(userInput)));
      } catch (NumberFormatException e) {
        System.out.printf(PARSE_EXCEPTION_FORMAT, userInput);
      }
      userInput = scanner.nextLine().trim();
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * FAHRENHEIT_PER_CELSIUS + FAHRENHEIT_FREEZING_POINT;
  }

  public static double convertF2C(double fahrenheit) {
    return 5 * (fahrenheit - FAHRENHEIT_FREEZING_POINT) / FAHRENHEIT_PER_CELSIUS;
  }

}
