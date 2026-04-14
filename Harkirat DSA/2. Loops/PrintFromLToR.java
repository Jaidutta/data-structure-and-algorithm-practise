import java.util.Scanner;

public class PrintFromLToR {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();
    while(l <= r) {
      System.out.print(l + " ");
      l++;
    }
  }
}
