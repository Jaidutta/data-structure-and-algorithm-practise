import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long number = sc.nextLong();
    if(number == 0) {
      System.out.print(1);
      return;
    }
    long answer = 1;
    for(long i = number; i >= 1; i--) {
      answer = answer * i;
    }
    System.out.print(answer);
  }
}
