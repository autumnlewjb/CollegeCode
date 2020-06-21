package practice.week6;

import java.util.Scanner;

public class CGPAClass{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//prompt user to enter cgpa
		System.out.println("Enter your CGPA below.");
		double cgpa = input.nextDouble();

		String status = "";
		if (cgpa >= 3.50 || cgpa <= 4.00){
			status = "First Class With Honours";
		}else if(cgpa >= 3.50 || cgpa <= 3.49){
			status = "Upper Second Class With Honours";
		}else if(cgpa >= 2.20 || cgpa <= 2.99){
			status = "Lower Second Class With Honours";
		}else if(cgpa >= 2.00 || cgpa >= 2.19){
			status = "Third Class With Honours";
		}else{
			status = "Sorry, you are not able to graduate.";
		}
		System.out.print(status);
	}
}