package Java;
import java.util.*;
public class Fibonacii {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value n");
        int n=sc.nextInt();int a=1;
        while(a<=n){
            if(a==1){
                System.out.println("0");
            }
            else if(a==2){
                System.out.println("1");
            }
            else{
                System.out.println(fib(a));
            }
            a++;
            }
            sc.close();
        }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
