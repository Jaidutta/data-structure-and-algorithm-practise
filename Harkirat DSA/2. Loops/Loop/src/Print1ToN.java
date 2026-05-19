import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print1ToN(n);
    }
    public static void print1ToN(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
