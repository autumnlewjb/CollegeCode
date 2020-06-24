package practice.week13;

import java.util.Scanner;

public class Practical3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int length = input.nextInt();
        System.out.print("Enter width of Rectangle: ");
        int width = input.nextInt();
        Practical3 obj = new Practical3();
        
        int area = obj.findArea(length,width);
        int perimeter = obj.findPerimeter(length,width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
        System.out.println("Area of Rectangle: " + area);
    }
    
    public int findArea(int l, int w){
        int area = l * w;
        return area;
    }
    public int findPerimeter(int l, int w){
        int perimeter = 2 * (l + w);
        return perimeter;
    }
}