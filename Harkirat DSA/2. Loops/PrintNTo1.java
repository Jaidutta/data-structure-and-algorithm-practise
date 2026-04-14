import java.util.Scanner;
public class PrintNTo1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int i = input;
    while(i >= 1) {
      if(i >=2) {
         System.out.print(i + " ");
      }
      else {
        System.out.println(i);
      }
      
      i--;
    }
  }
}


