import java.util.Scanner;

public class PracticalTwoFirst{
    static Scanner input = new Scanner(System.in);
    static double total;
    static final double COMPARE = 30;
    
    public static void main(String[] args){
        int numberOfPax = 7;
        int count = 0;
        int greater = 0;
        while (count<numberOfPax){
            System.out.print("Enter age: ");
            int age = input.nextInt();
            if (age > COMPARE){
                greater += 1;
            }
            count++;
        }
        
        System.out.println("\nNumber of age greater than 30 is: " + greater);
    }
}