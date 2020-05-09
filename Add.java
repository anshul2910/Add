import java.util.*;

class Add{
  public static void main(String args[]){
    int a;
    int b;
    int c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number : ");
    a = sc.nextInt();
    System.out.println("Enter Second Number : ");
    b = sc.nextInt();

    c = a + b;

    System.out.println("Sum of a and b is :" + c);

  }
}
