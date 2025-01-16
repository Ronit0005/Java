package Java;
import java.util.*;
public class IfElseIfClause {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked positive , negative or equal to zero");
        int num=sc.nextInt();
        if (num>0){
            System.out.printf("The number %d is positive",num);
        }
        else if(num<0){
            System.out.printf("The number %d is negative",num);
        }
        else{
            System.out.printf("The number %d is equal to zero",num);
        }
    }
    
}
