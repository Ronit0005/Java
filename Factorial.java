package Java;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n=s.nextInt();
    Factorial obj=new Factorial();
    System.out.println(obj.fact(n));
    }
    public int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
