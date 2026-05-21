import java.util.Scanner;

public class SwapAlternateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int inputArraySize = sc.nextInt();
            int [] inputArray = new int [inputArraySize];
            for(int i = 0; i < inputArraySize; i++) {
                inputArray[i] = sc.nextInt();
            }
            swapAlternate(inputArray);
            for(int i = 0; i < inputArraySize; i++) {
                System.out.print(inputArray[i] + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }

    private static void swapAlternate(int[] inputArray) {
        for(int i = 1; i < inputArray.length; i += 2) {
            swap(i, i - 1, inputArray);
        }
    }

    static void swap(int a, int b, int [] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;

    }
}
