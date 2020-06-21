import java.util.Scanner;

public class Main2{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Main2 obj = new Main2();
        System.out.print("Enter length: ");
        int length = input.nextInt();
        
        System.out.print("Enter width: ");
        int width = input.nextInt();
        
        System.out.println("Perimeter: " + obj.calPer(length, width));
        System.out.println("Area: " + obj.calArea(length,width));
        
    }
    protected int calPer(int l,int w){
        int perimeter = 2 * (l + w);
        return perimeter;
    }
    protected int calArea(int l, int w){
        int area = l * w;
        return area;
    }
}