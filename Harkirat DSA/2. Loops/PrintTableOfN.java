import java.util.Scanner;

public class PrintTableOfN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int i = 1;
    while(i <= 10) {
      System.out.println(input + " * " + i + " = " + input * i);
      i++;
    }
  }
}
