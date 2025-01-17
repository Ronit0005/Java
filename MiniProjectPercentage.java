// Writing a prg to calculate the percentage of a student in 5 subjects
package Java;
import java.util.*;
public class MiniProjectPercentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student");
        System.out.println("Enter the marks of the student in all the 5 subjects one by one");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        double average=(a+b+c+d+e)/5.0;
        System.out.println("The average of all the 5 subjects are "+average);
        sc.close();
    }
    
}
