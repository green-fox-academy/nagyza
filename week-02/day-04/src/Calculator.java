import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.26..
 */
public class Calculator {
  public static void main(String[] args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the expression:");
    String expression = scanner.nextLine();
    String operator = expression.substring(0, 1);
    int numberSeparator = expression.indexOf(" ", 2);
    String firstNum = expression.substring(2, numberSeparator);
    String secondNum = expression.substring((numberSeparator + 1), expression.length());
    calculator(operator, firstNum, secondNum);
  }
  private static void calculator(String operator, String firstNum, String secondNum) {
    int firstNumber = Integer.parseInt(firstNum);
    int secondNumber = Integer.parseInt(secondNum);
    if (operator.equals("+")) {
      System.out.println(addNums(firstNumber, secondNumber));
    } else if (operator.equals("-")) {
      System.out.println(subtractNums(firstNumber, secondNumber));
    } else if (operator.equals("*")) {
      System.out.println(multiplyNums(firstNumber, secondNumber));
    } else if (operator.equals("/")) {
      System.out.println(divideNums(firstNumber, secondNumber));
    } else if (operator.equals("%")) {
      System.out.println(modulusNums(firstNumber, secondNumber));
    } else {
      System.out.println("I don't find a valid operator.");
    }
  }

  private static int addNums(int firstNum, int secondNum) {
    return firstNum + secondNum;
  }

  private static int subtractNums(int firstNum, int secondNum) {
    return firstNum - secondNum;
  }

  private static int multiplyNums(int firstNum, int secondNum) {
    return firstNum * secondNum;
  }

  private static double divideNums(int firstNum, int secondNum) {
    return (double) firstNum / secondNum;
  }

  private static double modulusNums(int firstNum, int secondNum) {
    return (double) firstNum % secondNum;
  }
}
