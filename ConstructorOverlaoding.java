package Java;
class Employee03{
    int id;String name;
    Employee03(){
        id=1024;
        name="Rahul";
        System.out.println("The first constructor is called with id: "+id+" and name: "+name);
    }
    Employee03(int x,String y){
        id=x;
        name=y;
        System.out.println("The second constructor is called with id: "+id+" and name: "+name);
    }
}
public class ConstructorOverlaoding {
    public static void main(String[] args){
        Employee03 x=new Employee03();
        Employee03 y=new Employee03(1025,"Rohit");

    }
}
