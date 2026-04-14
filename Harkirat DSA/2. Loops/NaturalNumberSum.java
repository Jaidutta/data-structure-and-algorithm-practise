import java.util.Scanner;

public class NaturalNumberSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long number = sc.nextLong();
    long sumOfNaturalNumbers = number *(number + 1) / 2;
    System.out.print(sumOfNaturalNumbers);
  }
}