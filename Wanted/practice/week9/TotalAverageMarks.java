package practice.week9;

import java.util.Scanner;

public class TotalAverageMarks{
    static final int numOfStudent = 5;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int i;
        double total = 0;
        double[] marks = new double[numOfStudent];
        String[] matNumber = new String[numOfStudent];
        
        for(i=0;i<numOfStudent;i++){
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
        for(i=0;i<numOfStudent;i++){
            System.out.println((i+1) + "\t" + marks[i] + "\t" + matNumber[i]);
        }
        System.out.println();
        System.out.println("Total marks: " + total);
        System.out.println("\nAverage marks: " + average);
    }
}