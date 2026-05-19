import java.util.Scanner;

public class ReverseNumberAndStoreInAVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        reverseNumberAndStoreInAVariable(n);
    }

    private static void reverseNumberAndStoreInAVariable(long n) {
        long ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
