package Java;
import java.util.*;
class Revision{
    public static void main(String[] args){
        /*int a=10;int b=20;
        System.out.format("The value of a is %d and that of b is %d",a,b);
    */
    /*Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    */
    String name="Ronit Kumar Singh";
    //System.out.println("The length of the string is "+name.length());
    System.out.println("The lower case of the string is "+name.toLowerCase());
    System.out.println("The upper case of the string is "+name.toUpperCase());
    System.out.println("The trimed string is "+name.trim());
    System.out.println("The substring is "+name.substring(2));
    System.out.println("The substring is "+name.substring(2,5));
    System.out.println("The replaced string is "+name.replace("n0","h"));
    System.out.println("The start check is "+name.startsWith("R"));
    System.out.println("The end check is "+name.endsWith("tif"));
    System.out.println("To know the character at a particular index is "+name.charAt(4));
    System.out.println("To know the index of first occurence of a set of char or char alone "+name.indexOf("Ron"));
    System.out.println("To know the index of first occurence of a set of character after a particular index is "+name.indexOf("nit",0));
    System.out.println("To know the last occrence of a set of a character is "+name.lastIndexOf('i'));  //Here the control moves from the back to check the occurence of the String or char
    System.out.println("To know the last occurence of a set of character after a particular index is "+name.lastIndexOf("i",12));
    System.out.println("To check whether the two string are equal or not "+name.equals("Ronit Kumar Singh"));
    System.out.println("To check whether the two string are equal or not ignoring the case  "+name.equalsIgnoreCase("ronit kumar singh"));
    //sc.close();
    }
}