package Java;
class Circle02{
    int radius;
    Circle02(int x){
        this.radius=x;
    }
    public int area(){
        return this.radius*this.radius;
    }
}
class Cyclinder02 extends Circle02{
    int height;
    Cyclinder02(int x,int y){
        this.height=x;
        super(y);
    }
    public void areaCyc(){
        double area=2*(super.area())+2*3.14*radius*height;
        System.out.println("The area of the cyclinder is "+area);
    }
}
public class CircleAndCyclinder {
    public static void main(String[] args){
        Cyclinder02 ob=new Cyclinder02(10, 20);
        ob.areaCyc();
    }
}
