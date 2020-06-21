package practice.week13;

import java.util.Scanner;

public class Practical2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        Practical2 obj = new Practical2();
        System.out.println(obj.isEven(num));
    }
    public boolean isEven(int number){
        if (number % 2 == 0){
            return true; 
        }else{
            return false;
        }
    }
}