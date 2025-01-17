package Java;
import java.util.*;
public class MiniProjectWeb {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your website ....");
        String inp=sc.nextLine();
        if (inp.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if (inp.endsWith(".org")){
            System.out.println("Organisational website");
        }
        else{
            System.out.println("Other website");
        }
    sc.close();   
    }
    
}
