package practice.week11;

import java.util.Scanner;
import java.util.Arrays;

public class Practical4{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        input.nextLine();
        
        int found = 0;
        int[] arr = new int[size];
        int[] search = new int[size];
        int[] count = new int[size];
        System.out.println("\nEnter elements in array: ");
        int i;
        int x;
        for(i=0;i<size;i++){
            arr[i] = input.nextInt();
            input.nextLine();
        }
        for(i=0;i<arr.length;i++){
            found = 0;
            for (x=0;x<search.length;x++){
                if (search[x] == arr[i]){
                    found++;
                }
            }
            if (found == 0){
                search[i] = arr[i];
            }
        }
        for(i=0;i<arr.length;i++){
            for(x=0;x<search.length;x++){
                if(arr[i] == search[x]){
                    count[x]++;
                }
            }
        }
        System.out.println("\nFrequency of all elements of array: ");
        for (i=0;i<search.length;i++){
            if (search[i] != 0)
                System.out.println(search[i] + " occurs " + count[i] + " times");
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(search));
    }
}