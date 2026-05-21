import java.util.Scanner;

public class MaximumElementAndItsPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int [] arr = new int [arraySize];
        for(int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        int [] result = findMaxlementAndIndex(arr);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }

    private static int[] findMaxlementAndIndex(int[] arr) {
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                minIndex = i + 1;
            }
        }
        return new int[] {max, minIndex};
    }
}
