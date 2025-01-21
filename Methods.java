package Java;
import java.util.*;
public class Methods {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       /*System.out.println("Enter the value of a and b : ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       Methods obj=new Methods();
       obj.chance(a,b);
       System.out.printf("The value of and b in the main block is %d and %d",a,b);*/
       int[] num=new int[5];
       System.out.println("Enter the values of one by one");
       for(int i=0;i<5;i++){
        num[i]=sc.nextInt();
       }
    Methods ob=new Methods();
    ob.chance(num);
    System.out.println("Original value are :");
    for(int element:num){
        System.out.println(element);
    }
    }
    /*
    public void chance(int a,int b){
        a=a+b;
        b=a-b;
        System.out.printf("The value of a is %d and that of b is %d",a,b);
       } */
        public void chance(int[] num){
            for(int i=0;i<5;i++){
                num[i]=num[i]+5;
            }
            for(int i=0;i<5;i++){
                System.out.println(num[i]);
            }
        }
}
// Here we can see that even if changing the value of a and b in the method it does not reflect in the main method .
// But in case of array we can see that the original value of the element in the array also changes
