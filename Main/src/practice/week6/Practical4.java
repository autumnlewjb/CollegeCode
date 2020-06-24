package practice.week6;

import java.util.Scanner;

public class Practical4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //prompt user to enter cgpa
        System.out.println("Enter your CGPA below.");
        double cgpa = input.nextDouble();

        if (cgpa >= 3.50 || cgpa <= 4.00){
                System.out.println("First Class With Honours");
        }else if(cgpa >= 3.50 || cgpa <= 3.49){
                System.out.println("Upper Second Class With Honours");
        }else if(cgpa >= 2.20 || cgpa <= 2.99){
                System.out.println("Lower Second Class With Honours");
        }else if(cgpa >= 2.00 || cgpa >= 2.19){
                System.out.println("Third Class With Honours");
        }else{
                System.out.println("Sorry, you are not able to graduate.");
        }
    }
}