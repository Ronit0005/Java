package Java;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int [] arr;
        //arr=new int[5];
        int[] arr=new int[5];
        System.out.println("Enter the elements of array one by one");
        for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();  
        }
        for(int a:arr){
            System.out.println(a);// For each loop in java.
        }
        sc.close();
    }
}
