import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        double result = binomialCoefficient(n, r);
        System.out.println(result);
    }

    public static double binomialCoefficient(int n, int r) {
        long nfactorial = factorial(n);
        long rfactorial = factorial(r);
        long nrfactorial = factorial(n - r);
        return nfactorial / (rfactorial * nrfactorial);
    }
    public static long factorial(int n) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}
