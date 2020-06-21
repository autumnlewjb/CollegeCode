import java.util.Scanner;

public class Main3{
    static int l;
    static int w;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Main3 obj = new Main3();
        System.out.print("Enter length: ");
        l = input.nextInt();
        
        System.out.print("Enter width: ");
        w = input.nextInt();
        
        System.out.println("Perimeter: " + obj.calPer());
        System.out.println("Area: " + obj.calArea());
        
    }
    public int calPer(){
        int perimeter = 2 * (l + w);
        return perimeter;
    }
    public int calArea(){
        int area = l * w;
        return area;
    }
}