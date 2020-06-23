package practice.week13;

import java.util.Scanner;

public class Practical5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = input.nextInt();
        Practical5 obj = new Practical5();
        System.out.print(year + " is a leap year? ");
        System.out.println(obj.leapOrNot(year));
    }
    
    public boolean leapOrNot(int y){
        if (y % 400 == 0) {
            return true;
        }else if (y % 100 == 0){
            return false;
        }else{
            return y % 4 ==0;
        }
    }
}