import java.util.Scanner;

public class jtry{
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
  }
}