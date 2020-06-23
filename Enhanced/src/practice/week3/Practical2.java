package practice.week3;

import java.util.Scanner;

public class Practical2{
    public static void main(String[] args){
        double landprice = 17.00;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter name of village: ");
        String name = input.nextLine();
        System.out.print("Enter length of land in metre: ");
        double length = input.nextDouble();
        System.out.print("Enter width of land in metre: ");
        double width = input.nextDouble();
        
        double area = length * width;
        double price = area * landprice;
        
        System.out.println();
        
        System.out.println("Land area of " + name + " is: " + area + " square metre");
        System.out.println("The agricultural land price of " + name +" is: RM " + price);
    }
}