package Java;

public class Varargs {
    public static void main(String[] args){
       // Varargs in the java can be created .
       var();
       var(10,20);
       var(10,20,30);
    }
    public static void var(int...arr){
        int l=arr.length;
        int sum=0;
        for(int a:arr){
          sum+=a;
        }
        System.out.printf("The sum %d elements are %d",l,sum);
    }
}
