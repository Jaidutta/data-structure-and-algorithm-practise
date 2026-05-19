import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if( n == reversedNumber(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static long reversedNumber(long n) {
        long ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return ans;
    }
}
