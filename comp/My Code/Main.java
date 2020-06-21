package compkmpp;

import java.util.Scanner;
import java.util.Random;

public class Main{
  static Scanner input = new Scanner(System.in);
  static Random random = new Random();
  public static void main(String[] args){
    int guess = 0;
    int count = 0;
    boolean start = true;
    System.out.println("Welcome to this number-guessing game.");
    System.out.println("Enter -1 if you wish to exit game.");
    System.out.println();
    while(start){
      //int randInt = random.nextInt(1001);
      int randInt = 10;//for debugging purpose;
      if(randInt == 0){
        continue;
      }
      try{
        System.out.println();
        System.out.print("Guess the integer: ");
        guess = input.nextInt();
      }catch(Exception e){
        System.out.println("Make sure you enter an integer. (Range: 1 to 1000 inclusive)");
        System.out.println("Enter -1 if you wish to exit game.");
        System.out.println("Try again....");
        guess = input.nextInt();
      }
      count++;

      if(guess == -1){
        break;
      }else if(guess > randInt){
        System.out.println("Sorry, you're wrong.\nThe guess is higher than the answer.");
        System.out.println("Your guess should be lower.");
        continue;
      }else if(guess < randInt){
        System.out.println("Sorry, you're wrong.\nThe guess is lower than the answer");
        System.out.println("Your guess should be higher.");
        continue;
      }else if(guess == randInt){
        System.out.println("You got it right.");
        System.out.println("The answer is " + randInt);
        System.out.println("You've guessed " + count + " times.");
        while (true){
          char ans = 'y';
          try{
            System.out.println("Do you wish to continue?(Y/N)");
            ans = input.next().toLowerCase().charAt(0);
          }catch(Exception e){
            System.out.println("Invalid input. Enter Y/N only.");
            ans = input.next().toLowerCase().charAt(0);
          }
          if(ans == 'y'){
            System.out.println();
            count = 0;
            start = true;
            break;
          }else if(ans == 'n'){
            start = false;
            break;
          }else{
            System.out.println("Invalid Input. Try again.");
          }
        }
      }
    }
    System.out.println("---------------------Game has ended---------------------");
  }
}
