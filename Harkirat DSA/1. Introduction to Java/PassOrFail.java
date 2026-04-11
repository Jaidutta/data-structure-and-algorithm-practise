import java.util.Scanner;

public class PassOrFail {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int studenMark = sc.nextInt();
    if(studenMark >= 35) {
      System.out.println("Pass");
    }
    else {
      System.out.println("Fail");
    }
  }
}
