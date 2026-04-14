import java.util.Scanner;

public class CountNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalInputs = sc.nextInt();
    int [] numbers = new int[totalInputs];
    for(int i = 0; i < totalInputs; i++) {
      numbers[i] = sc.nextInt();
    }

    int positive = 0;
    int negative = 0;
    int even = 0;
    int odd = 0;

    for(int num: numbers) {
      if(num > 0) {
        positive = positive + 1;
        if(num % 2 == 0) {
          even = even + 1;
        }
        else {
          odd = odd + 1;
        }
        
      }
      else if(num < 0){
        negative = negative + 1;
        if(num % 2 == 0) {
           even = even + 1;
        }
        else {
          odd = odd + 1;
        }
      }
      if(num == 0) {
        even = even + 1;
      }
    }
  
      
    
    System.out.println(positive);
    System.out.println(negative);
    System.out.println(even);
    System.out.println(odd);
  }
}