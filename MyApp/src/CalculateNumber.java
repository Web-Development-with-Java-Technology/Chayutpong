import java.util.Scanner;

public class CalculateNumber {
    public static void main(String[] args) {
    Scanner A = new Scanner(System.in);
    System.out.print("Enter your number A: ");
    int a = A.nextInt();
    Scanner B = new Scanner(System.in);
    System.out.print("Enter your number B: ");
    int b = B.nextInt();
    A.close();
    B.close();
    int s = a+b;
    int m = a-b;
    int t = a*b;
    int d = a/b;
    System.out.println("A + B = "+s);
    System.out.println("A - B = "+m);
    System.out.println("A * B = "+t);
    System.out.println("A / B = "+d);
  }
}
