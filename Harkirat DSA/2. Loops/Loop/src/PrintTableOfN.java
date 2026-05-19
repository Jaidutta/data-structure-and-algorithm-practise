import java.util.Scanner;

public class PrintTableOfN {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       printTableOfN(n);
    }
    private static void printTableOfN(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = "  + n * i );
        }
    }
}
