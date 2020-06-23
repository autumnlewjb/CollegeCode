package practice.week11;

import java.util.Scanner;

public class Practical8{
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.print("Enter no. of age you want in array: ");
        
        int size = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter all the ages: ");
        int total = 0;
        
        for (int i=0;i<size;i++){
            total += input.nextInt();
            input.nextLine();
        }
        
        double average = total / size;
        
        System.out.println("Sum of all ages: " + total);
        System.out.println("Average age is: " + (int)average);
    }
}