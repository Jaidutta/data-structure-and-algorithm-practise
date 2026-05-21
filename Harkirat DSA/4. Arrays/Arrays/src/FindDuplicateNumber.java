import java.util.Scanner;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int arraySize = sc.nextInt();
            int [] array = new int [arraySize];
            for(int i = 0; i < arraySize; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println(findDuplicate(array));
            t--;
        }
        sc.close();
    }

    private static int findDuplicate(int[] array) {

        for(int i = 0; i < array.length; i++) {
            int target = array[i];
            int targetCount = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[j] == target) {
                    targetCount++;
                }
            }
            //
            if(targetCount == 2) {
                return target;
            }


        }

        return -1;
    }
}