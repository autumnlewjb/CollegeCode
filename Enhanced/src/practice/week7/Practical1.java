package practice.week7;

import java.util.Scanner;

public class Practical1{
    static Scanner input = new Scanner(System.in);
    
    public static double calculateBmi(double height, double weight){
        double bmi = weight / Math.pow(height, 2.0);
        return bmi;
    }
    
    public static void main(String[] args){
        int count = 0;
        
        while (count<6){
            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();
            System.out.print("Enter height in metre: ");
            double height = input.nextDouble();
            System.out.println((count+1) + " BMI: " + calculateBmi(height, weight));
            System.out.println();
            count++;
        }
    }
}