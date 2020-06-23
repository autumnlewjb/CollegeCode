package practice.week5;

import java.util.Scanner;

public class Practical1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter total loan: RM");
        double totalLoan = input.nextDouble();
        
        System.out.println("Enter year: ");
        int year = input.nextInt();
        
        //this is formula
        double debt = (totalLoan * 0.046) * year;
        double paymentPerYear = (debt/year) * 12;
        
        System.out.print("Your payment per year is "+ paymentPerYear);
    }
}