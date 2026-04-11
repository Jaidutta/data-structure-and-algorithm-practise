import java.util.Scanner;

public class MaxAndMinOf2Numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    if(number1 > number2) {
      System.out.println("Min = " + number2);
      System.out.println("Max = " + number1);
    }
    else {
      System.out.println("Min = " + number1);
      System.out.println("Max = " + number2);
    }
  }
}
