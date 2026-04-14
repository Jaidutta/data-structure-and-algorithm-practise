import java.util.Scanner;

public class PrintNumberInReverse {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long reversed = 0;

        long tempNum = Math.abs(num);

        int length = String.valueOf(tempNum).length();

        while (tempNum > 0) {
            long lastDigit = tempNum % 10;
            reversed = (reversed * 10) + lastDigit;
            tempNum = tempNum / 10;
        }

        if (num < 0) {
             System.out.print("-");
        }

        System.out.printf("%0" + length + "d", Math.abs(reversed));
    }
}