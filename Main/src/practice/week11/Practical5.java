package practice.week11;

import java.util.Scanner;

public class Practical5{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("\nEnter elements in array: ");
        
        for (int i = 0 ; i < size ; i++) {
            arr[i] = input.nextInt();
            input.nextLine();
        }
        
        System.out.println("\nFrequency of all elements of array: ");
        int p1, p2, i, count, length = arr.length;
        for (p1 = 0 ; p1 < length ; p1++) {
            count = 1;
            for (p2 = p1 + 1 ; p2 < length ; p2++) {
                if (arr[p1] == arr[p2]) {
                    for (i = p2 + 1 ; i < length ; i++) {
                        arr[i-1] = arr[i];
                    }
                    
                    count ++;
                    length -= 1;
                    p2 -= 1;
                }
            }
            System.out.println(arr[p1] + " occurs " + count + " times");
        }
    }
}