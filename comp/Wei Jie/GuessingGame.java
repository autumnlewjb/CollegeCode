import java.util.Random;
import java.util.Scanner;
public class GuessingGame{
    public static void main(String[]args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int play = 1;        
        int guess;
        System.out.println("-------------------------------------------------------");
        System.out.println("Team name: Musang Janggut");
        System.out.println("Team leader: Chia Wei Jie");
        System.out.println("Team members: Amin Nurasyhid, Chong Zi Jing, Azam Fazli");
        System.out.println("Class: F1P02");
        System.out.println("-------------------------------------------------------");
        System.out.println("(To quit the game, key in -1) ");
        while(play == 1){
            int randominteger = random.nextInt(11);
            int fre = 1;   
            System.out.print("Guess a number! \nEnter your first guess: ");
            guess = sc.nextInt();
            if(guess != -1){
                while(guess != randominteger){
                    System.out.print("You are incorrect, your guess should be ");
                    if(guess<randominteger){
                        System.out.println("higher.");
                    }
                    else{
                        System.out.println("lower.");
                    }
                    System.out.print("Enter your next guess: ");
                    guess = sc.nextInt();
                    fre++;
                    if(guess == -1){
                        break;
                    }
                }
            }
            if(guess == randominteger){
                System.out.println("You are correct!!");
                System.out.println("You have guessed "+fre+" time(s)");
                System.out.println("The correct answer is: "+randominteger);
            }
            else{
                //System.out.print("This game has ended.");
                break;
            }
            System.out.println("Do you want to play again? Key in 1 to continue or -1 to quit");
            play = sc.nextInt();
        }
        System.out.println();
        System.out.print("This game has ended.");
    }
}
           