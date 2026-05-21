import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputArraySize = sc.nextInt();
        int inputArray[] = new int[inputArraySize];
        int searchElement = sc.nextInt();
        for(int i = 0; i < inputArraySize; i++) {
            inputArray[i] = sc.nextInt();
        }

        System.out.println(isElementPresent(inputArray, searchElement));
        sc.close();
    }

    private static String isElementPresent(int[] inputArray, int searchElement) {
        for(var element: inputArray) {
            if(element == searchElement) {
                return "YES";
            }

        }
        return "NO";
    }
}
