import java.util.Scanner;

public class ArrayAge{
    static Scanner input = new Scanner(System.in);
    static final int numberOfStudent = 5;
    public static void main(String[] args){
        int i;
        int[] age = new int[numberOfStudent];
        for (i=0;i<age.length;i++){
            System.out.print("Enter age 1: ");
            age[i] = input.nextInt();
            input.nextLine();
        }
        for(i=0;i<age.length;i++){
            System.out.println("Element at index " + i + ": " + age[i]);
        }
    }
}