import java.util.Scanner;
import java.util.Arrays;

public class Practical5{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        input.nextLine();
        int[] age = new int[size];
        int[] search = new int[size];
        int[] value = new int[size];
        int count = 0;
        int found = 0;
        
        int i;
        System.out.println("\nEnter elements in array: ");
        for (i=0;i<size;i++){
            age[i] = input.nextInt();
        }
        
        int x;
        for(i=0;i<age.length;i++){
            for (x=0;x<search.length;x++){
                if (age[i] == age[x]){
                    count++;
                }
                if(age[i] == search[x]){
                    found++;
                }
            }
            if (count > 0 && found ==0){
                    search[i] = age[i];
                    value[i] = count;
                    count = 0;
            }
        }
        System.out.println(Arrays.toString(search));
        System.out.println(Arrays.toString(value));
        for (i=0;i<search.length;i++){
            if (search[i] != 0){
                System.out.println(search[i] + " occurs " + value[i] + " times");
            }
        }
    }
}