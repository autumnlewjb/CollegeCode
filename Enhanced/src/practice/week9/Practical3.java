package practice.week9;

import java.util.Scanner;

public class Practical3{
    static final int SIZE = 7;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int i;
        int[] age = new int[SIZE];
        int total = 0;
        
        for (i=0;i<age.length;i++){
            System.out.print((i+1) + " Enter employee age: ");
            age[i] = input.nextInt();
            total += age[i];
        }
        
        //calculate average below
        double average = (double)total / age.length;
        
        //print out sum and average
        System.out.println();
        System.out.println("Sum = " + total);
        System.out.println();
        System.out.println("Average = " + average);
    }
}