package Java;
import java.util.*;
public class MiniProjectMaxNo {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first number");
       int num1=sc.nextInt();
       System.out.println("Enter the second number");
       int num2=sc.nextInt();
       System.out.println("The maximum number is "+Math.max(num1, num2));
       sc.close();
       System.out.println(Double.MAX_VALUE);
    }
    
}
