import java.util.Scanner;
import java.lang.Math;

public class PracticalOneSecond{
    static Scanner input = new Scanner(System.in);
    public static double calculateBmi(double height, double weight){
        double bmi = weight / Math.pow(height, 2.0);
        return bmi;
    }
    public static void main(String[] args){
        int count;
        for(count=0;count<6;count++){
            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();
            System.out.print("Enter height in metre: ");
            double height = input.nextDouble();
            System.out.println((count+1) + " BMI: " + calculateBmi(height, weight));
            System.out.println();
        }
    }
}