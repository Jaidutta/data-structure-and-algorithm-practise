import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {

            int arraySize = sc.nextInt();
            int [] arr = new int [arraySize];
            for(int i = 0; i < arraySize; i++) {
                arr[i] = sc.nextInt();
            }
            sortedArray(arr);
            t--;
        }

    }

    private static void sortedArray(int[] arr) {
        int countZero = 0;
        int countOne = 0;
        for(int element: arr) {
            if(element == 0) {
                countZero++;
            } else if(element == 1) {
                countOne++;
            }
        }
        int i = 0;
       while(i < countZero){
            arr[i] = 0;
            i++;
        }
        while(i < (countZero + countOne)) {
            arr[i] = 1;
            i++;
        }

        for(int j = 0; j < arr.length; j++) {
            if(j < arr.length - 1) {
                System.out.print(arr[j] + " ");
            } else {
                System.out.println(arr[j]);
            }
        }

    }
}
