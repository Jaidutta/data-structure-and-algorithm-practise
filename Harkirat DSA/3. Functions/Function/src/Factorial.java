import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long n = sc.nextLong();

        System.out.println(findFactorial(n));
    }

    private static long findFactorial(long n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
