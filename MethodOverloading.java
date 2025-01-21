package Java;

public class MethodOverloading {
    public static void main(String[] args){
        MethodOverloading obj=new MethodOverloading();
        obj.sum();
        obj.sum(10,20,30);
        obj.sum(10,20);
    }
    public void sum(){
        System.out.println("The sum is 0");
    }
    public void sum(int a,int b){
        System.out.println("The sum of the two numbers a and b is "+(a+b));
    }
    public void sum(int a,int b,int c){
        System.out.println("The sum of the three numbers are "+(a+b+c));
    }
    
}
