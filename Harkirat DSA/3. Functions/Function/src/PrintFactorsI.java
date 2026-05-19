import java.util.Scanner;

public class PrintFactorsI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorsFrom1ToN(n);
    }

    private static void printFactorsFrom1ToN(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
