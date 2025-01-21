package Java;
//import java.util.*;
class Employee02{
    int id,salary;String name;
    Employee02(){
        System.out.println("The object is created");
    }
}
public class Constructor {
    public static void main(String[] args){
      Employee02 ronit=new Employee02();
      ronit.id=1024;
      //we can see that the constructor is called as soon as the object is created.
    }
}
