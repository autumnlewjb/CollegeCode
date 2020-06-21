import java.util.Random;
import java.util.Scanner;
public class Guessinggame
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int found=0;
        
        int guess;
        int tries=0;
        Random rand=new Random();//DECRLARE PREDEFINE RANDOM METHOD
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("                                      KMPP Guessing Game F1P05");
        System.out.println("                                          JAVA REVOLUTION");
        System.out.println("                           Muhammad Aeidel Bin Mohd Yusof(MS1813172777)(Leader)");
        System.out.println("                           Adam Adha Bin Kamarul Zaman   (MS1913108641)");
        System.out.println("                           Zakwan Afiq Bin Zaizul Imran  (MS1913106568)");
        System.out.println("                           Thayalen A/L Chanthiran       (MS1913141355)"); 
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println();
        int guessnum=rand.nextInt(1000);
        System.out.print("Guess a number in between 1 and 1000 or -1 to stop: ");//PROMPT USER
        guess=input.nextInt();
        while(guess!=-1)//GUESSING BODY LOOP
        {
            
            if(guess==guessnum)//CONDITION
            {
                
                System.out.println("\nYou guessed correctly");
                found = found +1;//TO FIND NUMBER OF CORRECT GUESSED
                
                System.out.println("The actual number was "+guessnum);
                System.out.println("You took "+tries+" number of tries");
                tries=0;
                System.out.println("\nPress -1 to stop or press a new guess number to continue");
                guessnum=rand.nextInt(1000);
            }
            else if(guess<guessnum)//CONDITION
            {
                System.out.println("Guess is low");
            }
            else if(guess>guessnum)//CONDITION
            {
                System.out.println("Guess is high");
            }
            System.out.print("Guess a number in between 1 and 1000 or -1 to stop: ");
            guess=input.nextInt();
            tries++;//TO FIND NUMBER OF TRY
        }
        System.out.println();//OUTPUT STATEMENT TO STOP THE GAME
        System.out.println("Number of correct "+found);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("                                     !!!GAME OVER!!!");
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
}