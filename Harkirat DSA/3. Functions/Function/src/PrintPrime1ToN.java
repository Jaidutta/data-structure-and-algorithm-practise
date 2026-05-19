import java.util.Scanner;

public class PrintPrime1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimes(n);
    }

    private static void printPrimes(int n) {
        for (int i = 1; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isPrime(int n) {
        int count = 0;
        for(int i = 1; i <= n; i ++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
