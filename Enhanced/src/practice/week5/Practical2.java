package practice.week5;

import java.util.Scanner;

public class Practical2{
    static final double ADULT = 15.00;
    static final double CHILDREN = 6.00;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        
        System.out.println("Enter number of adult: ");
        int numberOfAdult = input.nextInt();
        
        double priceChildren = CHILDREN * numberOfChildren ;
        double priceAdult = ADULT * numberOfAdult;
        
        double total = priceChildren + priceAdult;
        
        System.out.println("Amount payable: " + total);
    }
}