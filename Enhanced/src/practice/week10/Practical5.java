package practice.week10;

import java.util.Scanner;

public class Practical5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int num = input.nextInt();
        int[] arr = new int[num];
        
        int i;
        System.out.println("\nEnter all the elements:");
        for(i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
            input.nextLine();
        }
        
        //finding even and odd
        System.out.print("Odd numbers: ");
        for(i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("\nEven numbers:");
        for(i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}