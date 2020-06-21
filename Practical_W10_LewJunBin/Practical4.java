import java.util.Scanner;

public class Practical4{
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.print("Enter number of elements: ");
        int num = input.nextInt();
        input.nextLine();
        
        int[] arr = new int[num];
        int i;
        
        System.out.println("Enter " + arr.length + " marks");
        for(i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
            input.nextLine();
        }
        
        //finding max and min
        int max = arr[0], min = arr[0];
        
        for(i=0;i<arr.length;i++){
            if(arr[i] > max){
                if(max < min){
                    min = max;
                }
                max = arr[i];
            }
            if(arr[i] < min){
                if (min > max){
                    max = min;
                }
                min = arr[i];
            }
        }
        System.out.println("\nHighest mark is: " + max);
        System.out.println("Lowest mark is: " + min);
    }
}