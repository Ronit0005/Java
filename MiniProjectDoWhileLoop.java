package Java;
import java.util.*;
public class MiniProjectDoWhileLoop {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();int i=0;
    do{
        i++;
        System.out.println(i);
    }while(i<n);
    }
}
