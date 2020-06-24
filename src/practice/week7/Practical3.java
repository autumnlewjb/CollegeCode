package practice.week7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Practical3{
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        double total = 0;
        double price=0;
        do {
            total += price;
            System.out.print("Enter price: ");
            price = input.nextDouble();
        }while (price != -1);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("\nTotal Price:RM " + df.format(total));
    }
}