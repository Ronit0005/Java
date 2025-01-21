// Its a simple game of rock paper and scissor between user and computer
package Java;
import java.util.*;
/*0 for stone 
 * 1 for paper
 * 2 for scissor
 */
class Game{
    public int winOrLoss(String userChoice,int computerChoice){
         
         if(userChoice.equalsIgnoreCase("Rock")&&computerChoice==1){
            return -1;
         }
         else if(userChoice.equalsIgnoreCase("Rock")&&computerChoice==2){
            return 1;
         }
         else if(userChoice.equalsIgnoreCase("Paper")&&computerChoice==0){
            return 1;
         }
         else if(userChoice.equalsIgnoreCase("Paper")&&computerChoice==2){
            return -1;
         }
         else if(userChoice.equalsIgnoreCase("Scissor")&&computerChoice==0){
            return -1;
         }
         else if(userChoice.equalsIgnoreCase("Scissor")&&computerChoice==1){
            return 1;
         }
         else{
            return 0;
         }
    }
}
public class MiniProjectGame01 {
    public static void main(String[] args){
    Random ran=new Random();
    Scanner sc=new Scanner(System.in);
    Game g=new Game();
    while(true){
        int computerChoice=ran.nextInt(3);
        System.out.println("Enter your choice");
        String userChoice=sc.next();
        int t=g.winOrLoss(userChoice,computerChoice);
        if(t!=0){
            if(computerChoice==0){
            System.out.println("Computer choice is Rock");
        }
        else if(computerChoice==1){
            System.out.println("Computer choice is Paper");
        }
        else{
            System.out.println("Computer choice is Scissor");
        }
        if(t==1){
            System.out.println("You win");
        }
        else{
            System.out.println("You lose");
        }
        break;
    }
    else{
        System.out.println("It's a tie");
        if(computerChoice==0){
            System.out.println("Computer choice is Rock");
        }
        else if(computerChoice==1){
            System.out.println("Computer choice is Paper");
        }
        else{
            System.out.println("Computer choice is Scissor");
    }
    }
    computerChoice=0;
}
sc.close();
}
}