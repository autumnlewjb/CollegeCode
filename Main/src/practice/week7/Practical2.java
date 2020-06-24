package practice.week7;

import java.util.Scanner;

public class Practical2{
    static Scanner input = new Scanner(System.in);
    static double total;
    static final double COMPARE = 30;
    
    public static void main(String[] args){
        int numberOfPax = 7;
        int count;
        int greater = 0;
        
        for (count=0;count<numberOfPax;count++){
            System.out.print("Enter age: ");
            int age = input.nextInt();
            if (age > COMPARE){
                greater += 1;
            }
        }
        
        System.out.println("\nNumber of age greater than 30 is: " + greater);
    }
}