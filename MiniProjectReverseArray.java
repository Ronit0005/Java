// Writing a prg to reverse an array.
package Java;
import java.util.*;
public class MiniProjectReverseArray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int [] arr={1,2,3,4,5};
       int l =arr.length;int t;

          for(int i=0;i<(int)(arr.length/2);i++){
              t=arr[i];
              arr[i]=arr[l-i-1];
              arr[l-i-1]=t;
            }
            for(int el:arr){
        System.out.println(el);
       }
       sc.close();
    }
}
