import java.util.Scanner;

public class AddLastDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number1LastDigit = number1 % 10;
    int number2LastDigit = number2 % 10;
    System.out.println(number1LastDigit + number2LastDigit);
  }
}
