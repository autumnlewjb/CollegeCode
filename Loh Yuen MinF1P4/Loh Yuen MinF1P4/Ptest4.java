import java.util.Scanner;
public class Ptest4
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("\t-------------------------------");
        System.out.println("\tWELCOME TO HOTEL BOOKING SYSTEM");
        System.out.println("\t-------------------------------");
        System.out.print("Enter number of night: ");
        int numNight=input.nextInt();
        System.out.println("Enter number of room according to room type: ");
        System.out.print("Royal Suit: ");
        int r=input.nextInt();
        System.out.print("Executive Sea View: ");
        int e=input.nextInt();
        System.out.print("Garden Deluxe: ");
        int g=input.nextInt();
        double total=priceBooking(numNight,r,e,g);
        System.out.println("\nPrice for room booking:RM "+total);
        priceDisc(total);
    }
    static double priceBooking(int n,int r,int e,int g)
    {
        double price=n*((r*450.0)+(e*300.0)+(g*200.0));
        return price;
    }
    static void priceDisc(double total)
    {
        if(total>1000)
        {
            System.out.println("You are entitled for 20% discount");
            double dPrice=total*0.8;
            System.out.println("PRICE AFTER DISCOUNT IS:RM "+dPrice);
        }
        else
        {
            System.out.println("Sorry, you are not entitled for any discount,");
            System.out.println("please spend more than RM1000 to get 20% discount");
            System.out.print("PRICE TO BE PAID IS:RM "+total);
        }
    }
}