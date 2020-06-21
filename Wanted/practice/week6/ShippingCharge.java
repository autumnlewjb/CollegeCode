package practice.week6;

import java.util.Scanner;

public class ShippingCharge{
    public static void main(String[] args){
        // print menu
        System.out.println("Welcome to ABaTaa Delivery");
        System.out.println("State code          State Name          Shipping Charge");
        System.out.println("    1             Penang                  8.00");
        System.out.println("    2             Kedah                   10.50");
        System.out.println("    3             Perlis                  12.50");
        System.out.println("    4             Perak                   13.50");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the state code: ");
        int code = input.nextInt();
        
        System.out.print("Enter the Parcel's weight in KG: ");
        double weight = input.nextDouble();

        double charge = 0;

        if (code == 1){
            charge = 8;
        }
        if (code == 2){
            charge = 10.5;
        }
        if (code == 3){
            charge = 12.5;
        }
        if (code == 4){
            charge = 13.5;
        }
        
        // calculate shipping fee
        double fee = weight * charge;

        System.out.println("State Code              : " + code);
        System.out.println("Weight (Kg)             : " + weight);
        System.out.println("Shipping charge per Kg  : " + charge);
        System.out.println("Total Price (RM)        : " + fee);
    }
}