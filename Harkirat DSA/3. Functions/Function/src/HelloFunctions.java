import java.util.Scanner;

public class HelloFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFunctionNtimes(n);
    }

    private static void printFunctionNtimes(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println("I am learning functions");
        }
    }
}
