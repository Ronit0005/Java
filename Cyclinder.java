package Java;
class cyclinder01{
    private int radius,height;
    public void setRadius(int x){
        radius=x;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int x){
        height=x;
    }
    public int getHeight(){
        return height;
    }
}
public class Cyclinder {
    public static void main(String[] args){
        cyclinder01 ob=new cyclinder01();
        ob.setHeight(10);
        System.out.println(ob.getHeight());
        ob.setRadius(20);
        System.out.println(ob.getRadius());
    }
}
