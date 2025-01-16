package Java;
import java.util.*;
public class UserInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("Enter a boolean value");
        boolean b=sc.hasNextDouble();
        System.out.println(b);
        sc.close();
    }
    
}
