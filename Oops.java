package Java;
import java.util.*;
 class Employee{
    int id,salary;String name;
    public void printDetail(){
        System.out.println("The name of the employee is "+name);
        System.out.println("The id of the employee is "+id);
    } 
    public int getSalary(){
        return salary;
    }
}
public class Oops {
    public static void main(String[] args){
        // Solving programming problems using object creation is one of the most popular technique in the programming world .Is called oops
        // Dry : Don't Repeat Yourself
        Employee ronit=new Employee();
        ronit.id=1024;
        ronit.name="Ronit";
        ronit.salary=1000;
        ronit.printDetail();
        System.out.println("The salary of the employee is "+ronit.getSalary());
        Employee rahul=new Employee();
        rahul.id=1025;
        rahul.name="Rahul";
        rahul.salary=2000;
        rahul.printDetail();
        System.out.println("The salary of the employee is "+rahul.getSalary());
    }
}
