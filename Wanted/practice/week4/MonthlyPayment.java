package practice.week4;

/* IPO Chart
 * Input: totalLoan
 * Process: Calculate monthlyPayment based one totalLoan and year
 * Output: monthlyPayment
 */

import java.util.Scanner;

public class MonthlyPayment{
    static double interestRate = 4.6/100;
    
    public static double computeMonthlyInterest(double x, int year){
        double debt = ((x * interestRate) + x)/year;
        double interest = debt/12.0;
        return interest;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total loan: ");
        double totalLoan = sc.nextDouble();
        System.out.println("How many years for the payment?");
        int yearOfPayment = sc.nextInt();
        computeMonthlyInterest(totalLoan, yearOfPayment);
        System.out.println("Your monthly payment is " + computeMonthlyInterest(totalLoan, yearOfPayment));
    }
}