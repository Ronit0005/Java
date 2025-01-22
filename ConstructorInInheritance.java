package Java;
class Base01{
    Base01(){
        System.out.println("I am a default constructor of the base class");
    }
    Base01(int x){
      System.out.println("I am a parameterized constructor of the base class");
    }
}
class Derived01 extends Base01{
     Derived01(){
        System.out.println("I am a default constructor of the derived class");
     }
     Derived01(int x){
         super(100);
        System.out.println("I am a parameterized constructor of the derived class");
     }
}

public class ConstructorInInheritance {
    public static void main(String[] args){
        Derived01 on=new Derived01(100);
    }
}
// we can see that the default constructor of the base class is execuetd first from the constructor of the derived class.