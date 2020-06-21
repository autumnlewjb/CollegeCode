import java.util.Scanner;

public class Runner{
  public static void main(String[] args){
    while (true){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter distance: ");
      int distance = input.nextInt();
      if (distance >= 42){
        System.out.println("Full Marathon");
      }else if(distance < 42 || distance == 21){
        System.out.println("Half Marathon");
      }else{
        System.out.println("Fun Run");
      }
    }
  }
}
