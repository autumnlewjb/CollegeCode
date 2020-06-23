package practice.week6;

import java.util.Scanner;

public class Practical6{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How long have you parked your car?");
        double hours = input.nextDouble();
        double payment = 0;

        if (hours >= 0){
                payment += 2;
        }
        if (hours >= 2){
                payment += (hours - 2) * 2.5;
        }
        if (hours > 5){
                payment += (hours - 5) * 1.5;
        }
        
        System.out.print("Your total payable amount is: " + payment);
    }
}
