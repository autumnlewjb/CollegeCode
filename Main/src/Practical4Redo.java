import java.util.Scanner;

public class Practical4Redo{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
       System.out.print("Enter size of array: ");
       int size = input.nextInt();
       input.nextLine();
       int i;
       int[] arr = new int[size];
       int[] fr = new int[size];
       System.out.println("\nEnter elements in array: ");
       
       for(i=0;i<arr.length;i++){
           arr[i] = input.nextInt();
           input.nextLine();
           fr[i] = 1;
       }
       
       for(i=0;i<arr.length;i++){
           //if(i != arr.length - 1 && fr[i] != 0){
               for(int x=i+1;x<arr.length;x++){
                   if(arr[x] == arr[i]){
                       fr[x] = 0;
                       fr[i]++;
                    }
                //}
            }
       }
       System.out.println("\nFrequency of all elements of array: ");
       for(i=0;i<arr.length;i++){
           if(fr[i] != 0){
               System.out.println(arr[i] + " occurs " + fr[i] + " times");
            }
        }
    }
}