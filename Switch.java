/*package Java;
import java.util.*;
public class Switch {
    public static void main(String[] args){
        System.out.println("Enter your age in numbers");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch(age){
            case 18:{
                System.out.println("you are now an adult and can vote");
                break;
            }
            case 60:{
                System.out.println("You are a super senior citizen");
                break;
            }
            case 12:{
                System.out.println("You are a teenagers");
                break;
            }
            default:{
                System.out.println("you are a child");
            }
        }
    }
    
}
*/
package Java;
import java.util.*;
public class Switch {
    public static void main(String[] args){
        System.out.println("Enter your age in numbers");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch(age){
            case 18->{
                System.out.println("The age is 18");
            }
            case 12->{
                System.out.println("The age is 12");
            }
            default->{
                System.out.println("The age is not 12 or 18");
            }
        }
        sc.close();
    }
}
            