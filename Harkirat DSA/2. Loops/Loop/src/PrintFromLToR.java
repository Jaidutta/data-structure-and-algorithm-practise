import java.util.Scanner;

public class PrintFromLToR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        printFromLToR(l, r);
    }

    private static void printFromLToR(int l, int r) {
        for (int i = l; i <= r; i++) {
            System.out.print(i + " ");
        }

    }
}
