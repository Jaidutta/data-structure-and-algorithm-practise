import java.util.Scanner;

public class PrintAllPrimeFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            if(printAllPrime(i)) {
                System.out.println(i);
            }
        }
    }
     private static boolean printAllPrime(int number) {
         int count = 0;
         for (int i = 1; i <= number; i++) {
             if (number % i == 0) {
                 count += 1;
             }
         }
         return count == 2;
     }
}
