import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int [] arr = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(calculateArraySum(arr));
        sc.close();
    }
    public static long calculateArraySum(int[] arr) {
        long sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
