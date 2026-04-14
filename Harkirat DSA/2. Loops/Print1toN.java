import java.util.Scanner;

public class Print1toN {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int i = 1;
    while(i <= input) {
      System.out.println(i);
      i++;
    }
  }
}