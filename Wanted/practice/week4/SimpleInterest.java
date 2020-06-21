package practice.week4;

import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter principle amount: ");
        double p = input.nextDouble();
        
        System.out.println("Enter rate per annum: ");
        double r = input.nextDouble();
        
        System.out.println("Enter time(years)");
        int t = input.nextInt();
        
        // calculate interest
        double interest = (p*r*t)/100;
        System.out.println(interest);
    }
}