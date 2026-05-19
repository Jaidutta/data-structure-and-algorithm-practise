import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sumOfNNaturalNumbers(n);
    }

    private static void sumOfNNaturalNumbers(long n) {
        // Casting 'n' to long forces the multiplication to happen in 64-bit space
        long result = (long) n * (n + 1) / 2;
        System.out.println(result);
    }
}
