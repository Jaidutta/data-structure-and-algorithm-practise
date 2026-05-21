import java.util.Scanner;

public class MinimumElementAndItsPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int [] arr = new int [arraySize];
        for(int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        int [] result = findMinimumElementAndIndex(arr);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
    public static int[] findMinimumElementAndIndex(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = 0; i < arr.length; i++) {
          if(arr[i] < min) {
            min = arr[i];
            minIndex = i + 1;
          }
        }
        return new int[] {min, minIndex};
    }
}
