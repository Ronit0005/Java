package Java;
//import java.util.*;
class Employee01{
    private int id;private String name;
    public void setId(int x){
        id=x;
    }// Here we use setter and getter with private variable as we cannot access the private variable directly.
    public int getId(){
        return id;
    }
    public void setName(String x){
        name=x;
    }
    public String getName(){
        return name;
    }
    
}
public class GetterSetter {
    public static void main(String[] args){
    Employee01 ronit=new Employee01();
    ronit.setId(1024);
    System.out.println("The id of the employee is "+ronit.getId());
    ronit.setName("Ronit");
    System.out.println("The name of the employee is "+ronit.getName());
    }
}
