import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       printFactorsOfN(number);
    }
    public static void printFactorsOfN(int number){
        for (int i = 1; i <= number; i++) {
            // if the number is divisible by i, then i is a factor of number
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

}
