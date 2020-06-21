package practice.week7;

import java.util.Scanner;

public class PracticalThree{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        double total = 0;
        System.out.print("Enter price: ");
        double price = input.nextDouble();
        while (price != -1){
           total+= price;
           System.out.print("Enter price: ");
           price = input.nextDouble(); 
        }
        
        System.out.println("\nTotal Price:RM" + total);
    }
}