import java.util.Scanner;

public class PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        printSquare(n, ch);
    }
    public static void printSquare(int n, char ch) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
