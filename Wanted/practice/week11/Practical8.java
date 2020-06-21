package practice.week11;

import java.util.Arrays;
import java.util.Scanner;

public class Practical8{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter no. of age you want in array: ");
        int size = input.nextInt();
        int[] age = new int[size];
        input.nextLine();
        
        System.out.println("Enter all the ages: ");
        int i;
        int total = 0;
        for (i=0;i<age.length;i++){
            age[i] = input.nextInt();
            total += age[i];
        }
        double average = total / age.length;
        System.out.println("Sum of all ages: " + total);
        System.out.println("Average age is: " + (int)average);
    }
}