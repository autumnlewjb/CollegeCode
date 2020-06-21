import java.util.Scanner;

public class Exercise7{
    public static void main(String[] args){
        String name;                //declaration statement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        name = sc.next();
        String mark = sc.next();
        
        System.out.println("Hi!! " + name);
        System.out.println("String");
        String newString = sc.nextLine();
        System.out.println("Write an integer");
        
        int integer = sc.nextInt();
    }
}