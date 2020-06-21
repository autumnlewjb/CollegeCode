/* Group Name : The Solstice
 * Team Leader: Loh Yuen Min
 * Team Member: Nurul Fadlah Binti Abdullah
 *              Siti Maryam Binti Romli
 *              Nur Nazatul Nasuha Binti Abdul Rahim
 * Class      : F1P04
 */ 
import java.util.Scanner;
import java.util.Random;
public class guessingGame
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*             NUMBER GUESSING GAME               *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
        System.out.println("Instructions: ");                                   //give instructions to the user
        System.out.println("Guess a number between 1 and 1000.");
        System.out.println("Enter -1 to quit the game if you want."); 
        game(0);                                                                //call method game()
        for(int i=0;;i++)                                                       //for loop to determine whether user want to continue the game
        {
            char decision=decisionM();
            if(decision=='Y')
            {
            game(0);
            }
            else
            {break;}
        }
        System.out.print("\nThank you for playing this game!!");                
    }
    
    public static void game(int counter)                                        //method of the guessing game
    {
        Scanner input=new Scanner(System.in);
        int r_Num=numGen();                                                     //call method numGen() and assign value returned to r_Num
        int guess=0;
        while(guess!=-1)                                                       //while loop to determine the user's answer
        {
            counter++;
            System.out.print("\nEnter your guess: ");
            guess=input.nextInt();
            if(guess==-1)
            {
                System.out.println("Do you really don't want to continue? ");
                System.out.println("Enter Y if you want to continue or N if you want to quit.");
            }
            else if(guess==r_Num)
            {
                System.out.println("Congratulations!! Your guess is correct.");
                System.out.println("The number is "+r_Num+".");
                System.out.println("It took you "+counter+" times to guess the answer.");
                System.out.println("\nDo you want to play again? Enter Y or N.");
                break;
            }
            else if(guess>r_Num)
            {
                System.out.println("Incorrect!!Your guess is higher than the number.Please try again.");
            }
            else if(guess<r_Num)
            {
               System.out.println("Incorrect!!Your guess is lower than the number.Please try again.");
            }
            //counter++;
            }
    }
    
    public static char decisionM()                                           //method to determine whether user want to continue the game
    {
        Scanner input=new Scanner(System.in);
        char d=input.next().toUpperCase().charAt(0);
        return d;
    }
    
    public static int numGen()                                               //method to pick a random number from 1 to 1000
    {
        Random n_Generator=new Random();
        int n=n_Generator.nextInt(1000)+1;
        return n;
    }
}