// Wap to input a number and printing the resective day of the week
package Java;
import java.util.*;
public class MiniProjectDaysOfWeek {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the day of the week");
        int a=sc.nextInt();
        switch (a) {
            case 1->System.out.println("Today is Monday");
            case 2->System.out.println("Today is Tuesday");
            case 3->System.out.println("Today is Wednesday");
            case 4->System.out.println("Today is Thursday");
            case 5->System.out.println("Today is Friday");
            case 6->System.out.println("Today is Saturday");
            case 7->System.out.println("Today is Sunday");
            default->System.out.println("Invalid Input");
        }
        sc.close();
    }
    
}
