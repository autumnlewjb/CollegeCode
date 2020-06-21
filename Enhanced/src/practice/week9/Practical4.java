package practice.week9;

import java.util.Scanner;

public class Practical4{
    static final int SIZE = 5;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int i;
        double total = 0;
        
        double[] marks = new double[SIZE];
        String[] matNumber = new String[SIZE];
        
        for(i=0;i<SIZE;i++){
            System.out.print("Enter mark: ");
            marks[i] = input.nextDouble();
            input.nextLine();
            System.out.print("Enter matrix number: ");
            matNumber[i] = input.nextLine();
            System.out.println();
            total += marks[i];
        }
        
        //calculate average
        double average = total / marks.length;
        
        //output below
        System.out.println("Bil\tMARK\tMATRIX NUMBER");
        
        for(i=0;i<SIZE;i++){
            System.out.println((i+1) + "\t" + marks[i] + "\t" + matNumber[i]);
        }
        
        System.out.println();
        System.out.println("Total marks: " + total);
        System.out.println("\nAverage marks: " + average);
    }
}