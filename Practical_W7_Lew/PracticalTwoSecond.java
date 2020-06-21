import java.util.Scanner;

public class PracticalTwoSecond{
    static Scanner input = new Scanner(System.in);
    static double total;
    static final double compareValue = 30;
    public static void main(String[] args){
        int numberOfPax = 7;
        int count;
        int greaterThan30 = 0;
        for (count=0;count<numberOfPax;count++){
            System.out.print("Enter age: ");
            int age = input.nextInt();
            if (age > compareValue){
                greaterThan30+=1;
            }
        }
        
        System.out.println("\nNumber of age greater than 30 is: " + greaterThan30);
    }
}