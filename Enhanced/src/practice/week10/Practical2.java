package practice.week10;

import java.util.Scanner;

public class Practical2{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Enter number of elements: ");
        int num = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter " + num + " integers");
        int i;
        int[] arr = new int[num];
        
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        
        System.out.print("Enter search value: ");
        int searchValue = sc.nextInt();
        sc.nextLine();
        
        for(i=0;i<arr.length;i++){
            if(arr[i] == searchValue){
                System.out.println(searchValue + " is present at index " + i + " and location " + (i+1));
                break;
            }
        }
    }
}