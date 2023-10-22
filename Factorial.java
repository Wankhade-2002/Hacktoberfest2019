import java.util.Scanner;
public class dumm {
    public static void main(String[] args) {
      System.out.println("enter the number for factorial");
      Scanner a = new Scanner(System.in);
      int b = a.nextInt();
      int fact = 1; 
      for(int i=1; i<=b; i++){
        fact *= i;
      }
      System.out.println("the factorial of" + b + " is " + fact);
    }
}
