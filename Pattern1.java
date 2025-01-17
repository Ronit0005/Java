package Java;

public class Pattern1 {
    public static void main(String[] args){
        int t=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=t;j++){
                System.out.print("*");
            }
            t--;
            System.out.println();
        }
    }
    
}
