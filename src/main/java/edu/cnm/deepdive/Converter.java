package edu.cnm.deepdive;

import java.util.Scanner;

public class Converter {

  private static final String INPUT_PROMPT = "Please type a Celsius or Fahrenheit (ending with 'f') temperature (blank to quit): ";
  private static final String FAHRENHEIT_OUTPUT_FORMAT = "Fahrenheit temperature: %,.2f degrees%nPlease type a Celsius or Fahrenheit (ending with 'f') temperature (blank to quit):";
  private static final String PARSE_EXCEPTION_FORMAT = "Unable to parse \"%s\". Please try again: ";
  private static final double FAHRENHEIT_PER_CELSIUS = 9.0/ 5;
  private static final int FAHRENHEIT_FREEZING_POINT = 32;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(INPUT_PROMPT);
    String userInput = scanner.nextLine().trim().toLowerCase();
    while (!userInput.isEmpty()) {
      try {
        char lastChar = userInput.charAt(userInput.length() - 1);
        if (lastChar == 'f') {
          //TODO Convert everything in userInput BUT the last character from fahrenheit to celsius
        } else {
          System.out.printf(FAHRENHEIT_OUTPUT_FORMAT, convertC2F(Double.parseDouble(userInput)));

        }
      } catch (NumberFormatException e) {
        System.out.printf(PARSE_EXCEPTION_FORMAT, userInput);
      }
      userInput = scanner.nextLine().trim().toLowerCase();
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * FAHRENHEIT_PER_CELSIUS + FAHRENHEIT_FREEZING_POINT;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - FAHRENHEIT_FREEZING_POINT) / FAHRENHEIT_PER_CELSIUS;
  }

}
