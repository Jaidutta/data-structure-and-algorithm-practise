import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        countNumbers(nums);
    }
    private static void countNumbers(int [] numbers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            }
            if(numbers[i] % 2 == 0 || numbers[i] == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(positiveCount);
        System.out.println(negativeCount);
        System.out.println(evenCount);
        System.out.println(oddCount);

    }
}
