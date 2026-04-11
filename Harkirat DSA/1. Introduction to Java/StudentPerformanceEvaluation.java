import java.util.Scanner;

public class StudentPerformanceEvaluation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int studentMark = sc.nextInt();
    if(studentMark > 90) {
      System.out.println("Excellent");
    }
    else if(studentMark > 80 && studentMark <= 90){
      System.out.println("Good");
    }
    else if(studentMark > 70 && studentMark <= 80) {
      System.out.println("Fair");
    }
    else if(studentMark > 60 && studentMark <= 70) {
      System.out.println("Meets Expectations");
    }
    else {
      System.out.println("Below Par");
    }
  }
}
