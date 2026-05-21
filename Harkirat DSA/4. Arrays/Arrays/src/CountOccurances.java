import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();
        int target = sc.nextInt();
        int [] inputArray = new int[inputSize];
        for(int i = 0; i < inputSize; i++) {
            inputArray[i] = sc.nextInt();
        }
        System.out.println(elementCounter(inputArray, target));
        sc.close();
    }
    private static int elementCounter(int[] inputArray, int searchElement) {
        int count = 0;
        for(int element: inputArray) {
            if(element == searchElement) {
                count++;
            }
        }
        return count;
    }
}
