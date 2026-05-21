import java.util.Scanner;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int [] arr = new int [arraySize];
        for(int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        if(isSorted(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }

        }
        return true;
    }
}
