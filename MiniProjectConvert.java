package Java;
import java.util.Scanner;
public class MiniProjectConvert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println(str.replace(" ", "_"));
        sc.close();
    }
  
}
