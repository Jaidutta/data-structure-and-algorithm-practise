import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                count += 1;
            }
        }
        return count == 2;
    }
}
