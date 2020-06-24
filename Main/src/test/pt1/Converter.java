package test.pt1;

/* Description: This program is to convert prefixes of bytes and also bits
 * Author: Lew Jun Bin
 * Date modified: 6/12/2019
*/

import java.util.Scanner;

public class Converter{
    public static void main(String[] args){

        // print header
        System.out.println("---------------------------------------------------------");
        System.out.println("                    Practical Test 1");
        System.out.println("                   Code Subject: SC025");
        System.out.println("             Subject Name: Computer Science 2");
        System.out.println("---------------------------------------------------------");

        // body
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name  : ");
        String name = input.nextLine();
        
        System.out.print("Enter Practicum Class : ");
        String prac = input.nextLine().toUpperCase();

        System.out.print("Enter Number of Kilobyte : ");
        double noOfKb = input.nextDouble();

        //Calculation
        double noOfBit = noOfKb * 1024 * 8;
        double noOfTb = noOfKb / 1024 / 1024 / 1024;

        System.out.println("Number of Bit : " + noOfBit + " Bit");
        System.out.println("Number of Terabyte : " + noOfTb +" Tb \n\n");

        System.out.println("----This Program Is Created By " + name + " From " + prac + " ----");
    }
}