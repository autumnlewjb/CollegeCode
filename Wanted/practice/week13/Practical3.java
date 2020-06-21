package practice.week13;

import java.util.Scanner;

public class Practical3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = input.nextDouble();
        Practical3 obj = new Practical3();
        
        int area = obj.findArea(length,width);
        int perimeter = obj.findPerimeter(length,width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
        System.out.println("Area of Rectangle: " + area);
    }
    
    public int findArea(double l, double w){
        double area = l * w;
        return (int)area;
    }
    public int findPerimeter(double l, double w){
        double perimeter = 2 * (l + w);
        return (int)perimeter;
    }
}