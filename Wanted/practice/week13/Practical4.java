package practice.week13;

//import java.util.Scanner;

public class Practical4{
    public static void main(String[] args){
        Practical4 obj = new Practical4();
        System.out.println("Sum from 1 to 10 is: " + obj.sumFrom(1,10));
        System.out.println("Sum from 100 to 200 is: " + obj.sumFrom(100,200));
        System.out.println("Sum from 990 to 1000 is: " + obj.sumFrom(990,1000));
        
    }
    
    public int sumFrom(int x, int y){
        int sum = 0;
        for(int i=x;i<=y;i++){
            sum += i;
        }
        return sum;
    }
}