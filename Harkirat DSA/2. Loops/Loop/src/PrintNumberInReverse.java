import java.util.Scanner;

public class PrintNumberInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        printReversedNumber(n);
    }

    private static void printReversedNumber(long n) {
        String numStr = Long.toString(n);
        StringBuilder sb = new StringBuilder(numStr);

        // Use the built-in reverse method
        System.out.println(sb.reverse().toString());
    }
}
