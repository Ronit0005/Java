package Java;
import java.util.*;
public class MiniProjectPassOrFail {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in 3 subject");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        double average =(sub1+sub2+sub3)/3.0;
        if (average>40&&sub1>33&&sub2>33&&sub3>33){
            System.out.println("You have passed the exam congratulations!!!");
        }
        else{
            System.out.println("You have failed the exam better luck next time");
        }
        sc.close();
    }
    
}
