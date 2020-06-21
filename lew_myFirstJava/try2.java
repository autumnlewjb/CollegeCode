import java.util.Scanner;
import java.util.Random;

public class try2{
  public void printOutName(String yourName){
    System.out.println(yourName);
  }
  public static void main(String[] args){
    System.out.println("This is my first Java");
    System.out.println("Wow Java is fun!");
    Scanner input = new Scanner(System.in);
    System.out.print("What's your name?\t");
    String yourName = input.nextLine();
    System.out.println("Your Name is: " + yourName);
    Random randInt = new Random();
    int num = randInt.nextInt();
    System.out.println("Your lucky number is: " + num);
  }
}