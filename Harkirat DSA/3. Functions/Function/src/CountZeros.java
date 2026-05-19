import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(findZeroCount(n));
    }

    private static int findZeroCount(String n) {
        int count = 0;
       for(int i = 0; i < n.length(); i++) {
           if(n.charAt(i) == '0') {
               count++;
           }
       }
       return count;

    }
}
