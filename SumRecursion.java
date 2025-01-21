package Java;
import java.util.*;
public class SumRecursion {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println(sum(n));
    sc.close();
   } 
   public static int sum(int a){
    if(a==0){
        return 0;
    }
    else{
        return a+sum(a-1);
    }
   }
}
