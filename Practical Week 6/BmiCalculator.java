import java.util.Scanner;
import java.lang.Math;

public class BmiCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		weight = -1;
		height = -1;
		// prompt user input

		while (weight < 0 || height < 0){
			System.out.print("Enter your weight in kg: ");
			double weight = input.nextDouble();

			System.out.print("Enter your height in cm: ");
			double height = input.nextDouble();

			if(weight < 0 || height < 0){
				System.out.print("Please check your input. Input must be a positive value only.");
			}
		}
		// calculate bmi
		double bmi = height / Math.pow(height, 2.0);

		String status = "";
		if(bmi<=18){
			status = "Underweight";
		}else if (bmi<=24){
			status = "Normal";
		}else if(bmi<=29){
			status = "Overweight";
		}else if(bmi>29){
			status = "Obese";
		}

		System.out.println("Your BMI is " + bmi);
		System.out.println("Status: " + status);
	}
}
