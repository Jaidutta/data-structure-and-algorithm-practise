import java.util.Scanner;

public class PrintAllEvenNumbersTillN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int i = 1;
    while(i <= input) {
      if(i % 2 == 0) {
        System.out.print(i + " ");
      }
     
      i++;
    }
  }
}
