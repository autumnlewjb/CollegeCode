package practice.week3;

/** to calculate BMI of a person
 * using height and weight
 */

/*input: weight, height, name, gender, age, marital status
 * Process: calculate bmi using weight and height
 * output: BMI
 */

import java.util.*;
public class ComputerBMI{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Name: ");
        String name= input.nextLine();

        System.out.println("Gender: ");
        char gender= input.next().charAt(0);

        System.out.println("Enter your age: ");
        int age= input.nextInt();

        System.out.println("Marital Status: ");
        boolean marStatus = input.nextBoolean();

        System.out.println("weight: ");
        double weight = input.nextDouble();

        System.out.println("height: ");
        double height = input.nextDouble();

        //formula for bmi
        double BMI = weight/Math.pow(height, 2);

        System.out.println("\nBody Mass Index of " + name + ", age " + age + " is " +BMI);
    }
}
