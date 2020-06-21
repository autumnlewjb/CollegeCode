package practice.week9;

import java.util.Scanner;

public class ArrayTotalSum{
    static final int numOfInt = 10;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] integer = new int[numOfInt];
        int i;
        int total = 0;
        for (i=0; i<integer.length;i++){
            System.out.print("Enter integer: ");
            integer[i] = input.nextInt();
            total += integer[i];
        }
        System.out.println();
        System.out.println("Array length: " + integer.length);
        System.out.println("Total sum: " + total);
    }
}