import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    long sum = 0;
    while(num > 0) {
      long digit = num % 10;
      sum += digit;
      num = num / 10;

    }
    System.out.println(sum);
  }

}
