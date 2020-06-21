import java.util.Random;

public class Main2{
    static int num1;
    static int num2;
    public static void main(String[] args){
        Random num = new Random();
        Main2 obj = new Main2();
        num1 = num.nextInt(100) + 1;
        num2 = num.nextInt(100) + 1;
        System.out.println("Before swap, first number: " + num1);
        System.out.println("Before swap, second number: " + num2);
        obj.swap(num1,num2);
        System.out.println("After swap, first number: " + num1);
        System.out.println("After swap, second number: " + num2);
        
    }
    public void swap(int numA,int numB){
        int numC = numA;
        numA = numB;
        numB = numC;
        
        num1 = numA;
        num2 = numB;
    }
}