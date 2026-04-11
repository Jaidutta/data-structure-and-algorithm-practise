import java.util.Scanner;

public class Rectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length,  breadth;
    length = sc.nextInt();
    breadth = sc.nextInt();
    System.out.println("Area = "  + (length * breadth));
    System.out.println("Perimeter = " + 2 *(length+breadth));
  }
}