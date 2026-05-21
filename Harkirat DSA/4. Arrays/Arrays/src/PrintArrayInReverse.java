import java.util.Scanner;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        printArrayElementsInReverse(arr);
        sc.close();
    }
    public static void printArrayElementsInReverse(int[] arr) {
        for(int i = arr.length - 1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
