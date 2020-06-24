package test.pt2;

import java.util.Scanner;


public class PTest2{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        double total, tax, netPrice;

        System.out.print("Enter Package Code[A-School;B-Family;C-Education;D-Goverment;E-Business;F-International]:");
        char packCode = input.nextLine().toUpperCase().charAt(0);
        System.out.print("Enter number of participants: ");
        int n = input.nextInt();
        input.nextLine();
        String name;
        
        //calculate total and net price below
        if (packCode == 'A'){
            total = n * 30;
            name = "School";
        }else if(packCode == 'B'){
            total = n * 50;
            name = "Family";
        }else if(packCode == 'C'){
            total = n * 75;
            name = "Education Seminar";
        }else if(packCode == 'D'){
            total = n * 90;
            name = "Government Seminar";
        }else if(packCode == 'E'){
            total = n * 110;
            name = "Business Seminar";
        }else if(packCode == 'F'){
            total = n * 125;
            name = "International Seminar";
        }else{
            total = 0;
            name = null;
            System.err.println("This package is not available yet.");
        }
        
        tax = total * 10/100;
        netPrice = total + tax;
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("\tPACKAGE INFORMATION: MINILAND RESORT");
        System.out.println("--------------------------------------------------");
        System.out.println("\nPackage Code\t\t: " + packCode);
        System.out.println("Package Name\t\t: " + name);
        System.out.println("Number of participants\t: " + n);
        System.out.println();
        System.out.println("Total Price\t\t: RM" + total);
        System.out.println("Government Tax\t\t: RM" + tax);
        System.out.println("Nett Price\t\t: RM" + netPrice);
        
    }
}