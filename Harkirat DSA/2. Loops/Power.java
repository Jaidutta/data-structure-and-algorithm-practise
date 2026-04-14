import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt();
    long n = sc.nextLong();
    
        if (n == 0 || x == 1.0) {
          System.out.print(1);
          return;
        }
        
        long temp = n; // to avoid integer overflow
        
        // Handle negative exponents
        if (n < 0) {
            x = 1 / x;
            temp = -1L * n;
        }

        long ans = 1;

        for (long i = 0; i < temp; i++) {
            // Multiply ans by x for n times
            ans *= x; 
        }
        System.out.print(ans);
  }   

}


