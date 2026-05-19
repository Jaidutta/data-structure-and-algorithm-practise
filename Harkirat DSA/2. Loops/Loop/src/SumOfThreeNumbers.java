import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int result = sum(num1, num2, num3);
        System.out.println(result);

    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
