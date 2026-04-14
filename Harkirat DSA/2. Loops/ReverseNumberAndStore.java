import java.util.Scanner;

public class ReverseNumberAndStore {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long number = sc.nextLong();
    long tempNum = number;
    

   
    long ans = 0;
    while(tempNum > 0) {
      long lastDigit = tempNum % 10;
      ans = ans * 10 + lastDigit;
      tempNum = tempNum / 10;
    }
    
    System.out.print(ans);

  }
}
