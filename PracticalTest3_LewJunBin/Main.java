/*Author: Lew Jun Bin
   Date Modified: 14/2/2020
   Description: This program is for AZON Sdn. Bhd. to record dropship's sales, determining the highest sales, calculate total and average and list down sales that meet the target.
   */
    


import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        final int size = 10;
        final String month = "February";
        
        String[] name = new String[size];
        String[] id = new String[size];
        double[] sales = new double[size];
        
        int i;
        double total = 0, average;
        for(i=0;i<name.length;i++){
            System.out.print("Enter dropship's name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter dropship's id: ");
            id[i] = sc.nextLine();
            System.out.print("Enter sales in " + month + ": RM ");
            sales[i] = sc.nextDouble();
            System.out.println();
            sc.nextLine();
            total += sales[i];
        }
        average = total / sales.length;
        
        System.out.println("Sales for AZON company in " + month);
        System.out.println("Total sales: " + "RM " + total);
        System.out.println("Average sales: " + "RM " + average);
        
        int highestIndex = 0;
        int found = 0;
        double searchValue = 10000;
        
        //finding max
        System.out.println();
        for(i=0;i<sales.length;i++){
            if(sales[i] > sales[highestIndex]){
                highestIndex = i;
            }
        }
        
        System.out.println();
        System.out.println("Best Dropship's Name: " + name[highestIndex]);
        System.out.println("ID: " + id[highestIndex]);
        
        //do search
        System.out.println();
        System.out.println("Dropship's Name\t\tID\t\tSales");
        for(i=0;i<sales.length;i++){
            if(sales[i] > searchValue){
                System.out.println(name[i] + "\t\t\t" + id[i] + "\t" + sales[i]);
                found++;
            }
        }
        System.out.println("-------------------------End Of List------------------------");
        System.out.println();
        if(found == 0){
            System.out.println("No one has sales above " + searchValue);
        }
        
        System.out.println();
        System.out.println("The Number of Dropship's that Meet the Target" + "(RM" + (int)searchValue + "): " + found);
    }
}