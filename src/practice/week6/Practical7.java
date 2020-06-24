package practice.week6;

import java.util.Scanner;

public class Practical7{
    public static void main(String[] args){
        
        // Ugly table and in syllabus
        // System.out.println("Welcome to ABaTaa Delivery");
        // System.out.println("State code          State Name          Shipping Charge");
        // System.out.println("    1             Penang                  8.00");
        // System.out.println("    2             Kedah                   10.50");
        // System.out.println("    3             Perlis                  12.50");
        // System.out.println("    4             Perak                   13.50");
        
        // Nice table but not in syllabus
        System.out.println("Welcome to ABaTaa Delivery");
        System.out.printf("%10s\t%10s\t%15s\n","State Code","State Name", "Shipping Charge");
        System.out.printf("%10d\t%10s\t%15.2f\n", 1, "Penang", 8.00);
        System.out.printf("%10d\t%10s\t%15.2f\n", 2, "Kedah", 10.50);
        System.out.printf("%10d\t%10s\t%15.2f\n", 3, "Perlis", 12.50);
        System.out.printf("%10d\t%10s\t%15.2f\n", 4, "Perak", 13.50);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the state code: ");
        int code = input.nextInt();
        
        System.out.print("Enter the Parcel's weight in KG: ");
        double weight = input.nextDouble();

        double charge;

        if (code == 1){
            charge = 8;
        }else if (code == 2){
            charge = 10.5;
        }else if (code == 3){
            charge = 12.5;
        }else if (code == 4){
            charge = 13.5;
        }else{
            charge = 0;
        }
        
        // calculate shipping fee
        double fee = weight * charge;

        System.out.printf("%-22s: %d\n", "Status Code", code);
        System.out.printf("%-22s: %.2f\n", "Weight (KG)", weight);
        System.out.printf("%-22s: %.2f\n", "Shipping charge per Kg", charge);
        System.out.printf("%-22s: %.2f\n", "Total Price (RM)", fee);
    }
}