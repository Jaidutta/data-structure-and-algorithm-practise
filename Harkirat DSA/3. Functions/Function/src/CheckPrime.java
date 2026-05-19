import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
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
