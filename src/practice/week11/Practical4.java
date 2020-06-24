package practice.week11;

import java.util.Scanner;

public class Practical4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int[] count = new int[arr.length];
        
        System.out.println();
        System.out.println("Enter elements in array: ");
        
        for (int i=0 ; i < arr.length; i++) {
            arr[i] = input.nextInt();
            input.nextLine();
            count[i] = 1;
        }
        
        int p1, p2;
        for (p1 = 0 ; p1 < arr.length ; p1++) {
            for (p2 = p1 + 1 ; count[p1] != -1 && p2 < arr.length ; p2++) {
                if (arr[p1] == arr[p2]) {
                    count[p1] += 1;
                    count[p2] = -1;
                }
            }
        }
        System.out.println("\nFrequency of all elements of array: ");
        for (int i=0 ; i < arr.length ; i++) {
            if (count[i] != -1) {
                System.out.println(arr[i] + " occurs " + count[i] + " times");
            }
        }
    }
}