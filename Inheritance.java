package Java;
class Base{
     private int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public void printMe(){
        System.out.println("I am a constructor of the base class");
    }
}
class Derived extends Base{
     private int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class Inheritance {
    public static void main(String[] args){
        Derived ob=new Derived();
        ob.setX(12);
        System.out.println("The value of x is "+ob.getX());
        ob.setY(100);
        System.out.println("The value of y is "+ob.getY());
    }
}
