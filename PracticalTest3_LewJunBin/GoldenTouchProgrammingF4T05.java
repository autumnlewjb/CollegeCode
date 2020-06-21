/**
 * This is an application that play a guessing game with number.
 * F4T05
 * Kbrs (Team Name)
 * Leader (TUNG CHUN XIAN)
 * Member (GOH KANG YUE)
 * Member (NURUL AS SHIMA)
 * Member (NUR SYAZLIN AFIKHA) 
 * @version (15 February 2020)
 */

import java.util.Random;
import java.util.Scanner;

public class GoldenTouchProgrammingF4T05
{public static void main(String[]args)
 {Random rand = new Random();
  int numberToGuess = rand.nextInt(1000) + 1;// randomly generates a number between 1 to 1000
  //int numberToGuess = 10;
  int numberOfTries = 0;
  Scanner input = new Scanner(System.in);
  int guess;
  String restart;
  System.out.println("***************************************************************");
  System.out.println("\t\tGUESS THE SECRET NUMBER");
  System.out.println("***************************************************************");
  System.out.println("Enter a number from 1 to 1000 (Enter 0 to quit) : ");// prompt user guess the number
  guess = input.nextInt();
  
  
  
  while (guess != 0) {  //loops through game until user gets answer correct or quits
      
       numberOfTries++;
       
       
       if (guess == numberToGuess ){ //if user guess correctly, this message is displayed
          System.out.println("***************************************************************");
          System.out.println("\nCongratulations! You just guessed correctly in the probablility of 0.001%");
          System.out.println("You made "+numberOfTries+" guesses.");
          System.out.println("***************************************************************");
          System.out.println("\nWould you like to play again? Please enter YES or NO");
          restart = input.next();
          if (restart.equalsIgnoreCase("Yes")){
              numberToGuess = rand.nextInt(1000) + 1;
              numberOfTries = 0;
              numberOfTries++;
              System.out.println("***************************************************************");
              System.out.println("\nEnter a number from 1 to 1000 (Enter 0 to quit) : ");
              guess = input.nextInt();           
          }
          else
              break;
       }
       else if (guess < numberToGuess ){
          System.out.println("Your guess is too low, try a higher number.");
          guess = input.nextInt();
       }
       else if (guess > numberToGuess ){
          System.out.println("Your guess is too high, try a lower number.");
          guess = input.nextInt();
       }        
  }   
  
  System.out.println("\nGame over");//if user enters 0 to quit game, this message is displayed          
  System.out.println("Thanks for playing!");
  System.out.println("***************************************************************");
       
 }
 
}
