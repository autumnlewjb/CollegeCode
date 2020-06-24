package practice.week3;

/** to calculate BMI of a person
 * using height and weight
 */

/*input: weight, height, name, gender, age, marital status
 * Process: calculate bmi using weight and height
 * output: BMI
 */

import java.util.Scanner;

public class Practical1{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Name: ");
        String name= input.nextLine();

        System.out.print("Gender: ");
        char charAt = input.next().charAt(0);

        System.out.print("Enter your age: ");
        int age= input.nextInt();

        System.out.print("Marital Status: ");
        boolean marStatus = input.nextBoolean();

        System.out.print("weight: ");
        double weight = input.nextDouble();

        System.out.print("height: ");
        double height = input.nextDouble();

        // formula for bmi
        // double BMI = weight/(height*height;
        
        // faster approach
        double BMI = weight/Math.pow(height, 2);

        System.out.println("\nBody Mass Index of " + name + ", age " + age + " is " +BMI);
    }
}
