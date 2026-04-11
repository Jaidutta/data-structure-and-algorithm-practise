import java.util.Scanner;

public class MaxAndMinOfThreeNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();

    if(number1 == number2 && (number3 == number2 || number3 == number1)) {
      System.out.println("Min = " + number3);
      System.out.println("Min = " + number3);
    }
    else if(number1 == number2 && number1 < number3 ) {
      System.out.println("Min = " + number2);
      System.out.println("Max = " + number3);
    }
    else if(number1 == number3 && number3 < number2 ) {
      System.out.println("Min = " + number3);
      System.out.println("Max = " + number1);
    }
    else if (number1 > number2 && number1 > number3) {
      if (number2 > number3) {
        System.out.println("Min = " + number3);
      } else {
        System.out.println("Min = " + number2);
      }
      System.out.println("Max = " + number1);
    } 
    else if (number2 > number1 && number2 > number3) {
      if (number3 > number1) {
        System.out.println("Min = " + number1);
      } else {
        System.out.println("Min = " + number3);
      }
      System.out.println("Max = " + number2);
    } 
    else {
      if (number2 > number1) {
        System.out.println("Min = " + number1);
      } else {
        System.out.println("Min = " + number2);
      }
      System.out.println("Max = " + number3);
    }
  }
}
