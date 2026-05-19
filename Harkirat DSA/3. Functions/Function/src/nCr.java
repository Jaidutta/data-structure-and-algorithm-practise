import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = sc.nextLong();
        System.out.println(findNcr(n, r));
    }

    private static long findNcr(long n, long r) {
        if(r == 0) return 1;
        return findFactorial(n) / (findFactorial(r) * findFactorial(n - r));
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
