import java.util.Scanner;

public class CalculatorII {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long number1 = sc.nextLong();
    long number2 = sc.nextLong();
    System.out.println(number1 + " + "  + number2 + " = " + (number1 + number2));
    System.out.println();
    System.out.println(number1 + " - "  + number2 + " = " + (number1 - number2));
    System.out.println();
    System.out.println(number1 + " * "  + number2 + " = " + (number1 * number2));
    System.out.println();
    System.out.println(number1 + " / "  + number2 + " = " + (number1 / number2));
    System.out.println();
    System.out.println(number1 + " % "  + number2 + " = " + (number1 % number2));
    
  }
}
