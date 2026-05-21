import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int [] arr = new int [arraySize];
        for(int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        reverseAnArray(arr);
        for(int i = 0; i < arraySize; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    private static void reverseAnArray(int[] arr) {
       int l = 0;
       int r = arr.length - 1;
       while(l <= r) {
           swap(l, r, arr);
           l++;
           r--;
       }

    }
    static void swap(int a, int b, int [] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;

    }
}
