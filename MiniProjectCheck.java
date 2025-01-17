// Writing a program to check whether the entered value is an integer or not.
package Java;

import java.util.Scanner;

public class MiniProjectCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter the number to be checked whether it is a integer or not");
        boolean a =sc.hasNextInt();
        if (a){
            System.out.println("The entered number is a integer");
        }
        else{
            System.out.println("The entered number is not a integer");
        }
        sc.close();
    }
    
}
