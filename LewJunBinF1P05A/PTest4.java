import java.util.Scanner;

public class PTest4{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("\t-----------------------------");
        System.out.println("\tWELCOME TO HOTEL BOOKING SYSTEM");
        System.out.println("\t-----------------------------");
        
        System.out.print("enter number of night:");
        int nights = input.nextInt();
        System.out.println("enter number of room according to room type:");
        System.out.print("Royal Suit:");
        int numA = input.nextInt();
        System.out.print("Executive Sea View:");
        int numB = input.nextInt();
        System.out.print("Garden Deluxe:");
        int numC = input.nextInt();
        
        System.out.println();
        double total = priceBooking(nights,numA,numB,numC);
        System.out.printf("Price for room booking:RM %.2f%n",total);
        priceDiscount(total);
    }
    public static double priceBooking(int a, int x, int y, int z){
        final double A = 450;
        final double B = 300;
        final double C = 200;
        double total = (x*A) + (y*B) + (z*C);
        total = total * a;
        return total;
    }
    public static void priceDiscount(double x){
        double discountPercent = 0;
        double discountPrice = x;
        if(x > 1000){
            discountPercent = 20;
            discountPrice = x * (100 - discountPercent) / 100;
            System.out.println("You are entitled for " + (int)discountPercent + "% discount");
        }else{
            System.out.println("Sorry, you are not entitled for any discount, please spend more than RM1000 to get 20% discount");
        }
        System.out.printf("PRICE AFTER DISCOUNT IS: RM %.2f%n", discountPrice);
    }
}