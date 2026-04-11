import java.util.Scanner;

public class Factor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    if(number1 % number2 == 0) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}
