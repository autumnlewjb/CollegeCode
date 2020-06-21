import java.util.Scanner;

public class PracticalTwoFirst{
    static Scanner input = new Scanner(System.in);
    static double total;
    static final double compareValue = 30;
    public static void main(String[] args){
        int numberOfPax = 7;
        int count = 0;
        int greaterThan30 = 0;
        while (count<numberOfPax){
            System.out.print("Enter age: ");
            int age = input.nextInt();
            if (age > compareValue){
                greaterThan30+=1;
            }
            count++;
        }
        
        System.out.println("\nNumber of age greater than 30 is: " + greaterThan30);
    }
}