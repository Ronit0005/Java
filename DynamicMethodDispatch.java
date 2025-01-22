package Java;
class Phone{
    public void calling(){
        System.out.println("Calling anyone......");
    }
    public void radio(){
        System.out.println("Radio is on....");
    }
}
class SmartPhone extends Phone{
    public void calling(){
        System.out.println("Calling as well as video calling a phone");
    }
    public void playingBgmi(){
        System.out.println("Playing bgmi......");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args){
        Phone ob=new SmartPhone();
        ob.radio();
        //ob.playingBgmi(); // Throws an error.
        ob.calling();
    }
}
// We can see that the method of super class can be called but not the method of derived class can be called using the dynamic method dispatch.
