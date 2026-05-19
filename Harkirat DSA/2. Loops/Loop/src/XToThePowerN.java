import java.util.Scanner;

public class XToThePowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        xPowerN(x, n);
    }

    private static void xPowerN(int x, int n) {
        if (n == 0) {
            System.out.println(1);
            return;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }



        System.out.println(result);

    }
}
