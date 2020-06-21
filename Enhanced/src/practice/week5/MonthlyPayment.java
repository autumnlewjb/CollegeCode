package practice.week5;

/* IPO Chart
 * Input: totalLoan
 * Process: Calculate monthlyPayment based one totalLoan and year
 * Output: monthlyPayment
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class MonthlyPayment{
    static double interestRate = 4.6 / 100;
    
    public static String computeMonthlyInterest(double x, int year){
        double debt = ((x * interestRate) + x)/year;
        double interest = debt / 12.0;
        
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(interest);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your total loan: ");
        double totalLoan = sc.nextDouble();
        
        System.out.println("How many years for the payment?");
        int yearOfPayment = sc.nextInt();
        
        System.out.println("Your monthly payment is " + computeMonthlyInterest(totalLoan, yearOfPayment));
    }
}