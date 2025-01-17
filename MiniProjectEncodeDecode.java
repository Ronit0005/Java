// Writing a prg which can encode and decode into secrete language by adding 8 to every character.
package Java;
import java.util.*;
public class MiniProjectEncodeDecode {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         String nstr="";char ch;
         System.out.println("Enter 1 to Encode and 0 to Decode");
         int inp=sc.nextInt();
         sc.nextLine();
         if(inp==1){
            System.out.println("Enter the string to be Encoded");
            String str=sc.nextLine();
            str=str+' ';
            for(int i=0;i<str.length();i++){
               ch=str.charAt(i);
               if(ch!=' '){
                  nstr=nstr+(char)((int)(ch)+8);
               }
               else{
                nstr=nstr+' ';
               }
            }
            System.out.println("The Encoded form is "+nstr);
         }
         else{
            System.out.println("Enter the code which you want to decode");
            String str=sc.nextLine();char chr;String nst="";
            str=str+' ';
            for(int i=0;i<str.length();i++){
               chr=str.charAt(i);
               if(chr!=' '){
                nst=nst+(char)((int)(chr)-8);
               }
               else{
                nst=nst+' ';
               }
            }
            System.out.println("The decoded form is "+nst);
         }
        sc.close();
    }
    
}
