import java.util.Scanner;

class Exercise2{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //Getting int input
        System.out.print("Enter integer: ");
        float myInt = input.nextInt();
        System.out.println("Integer entered= " + myInt);
        
        //Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered: " + myDouble);
        
        // Getting String input
        System.out.print("Enter test: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }
}