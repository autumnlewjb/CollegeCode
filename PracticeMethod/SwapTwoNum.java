import java.util.Scanner;

public class SwapTwoNum{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        SwapTwoNum setOne = new SwapTwoNum();
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.println("Before swap the first number is " + num1);
        System.out.println("After swap the first number is " + setOne.swapforA(num1,num2));
        System.out.println("Before swap the second number is " + num2);
        System.out.println("After swap the second number is " + setOne.swapforB(num1,num2));
    }
    
    public int swapforA(int numA, int numB){
        int a = numA;
        int b = numB;
        a = a + b;
        b = a - b;
        a = a - b;
        
        return a;
    }
    
    public int swapforB(int numA, int numB){
        int a = numA;
        int b = numB;
        a = a + b;
        b = a - b;
        a = a - b;
        
        return b;
    }
}