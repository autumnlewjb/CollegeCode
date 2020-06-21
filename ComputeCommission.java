/*Description: This program is used to calculate commission for Mr Daniel Ahmad.
* Author: Lew Jun Bin
* Date: 4/12/2019
*/

import java.util.Scanner;

public class ComputeCommission{
  //the value assigned for the variable below is customizable
  static final int pricePerUnitA = 1350;
  static final int pricePerUnitZ = 1900;
  static final double commissionRateA = 0.09;
  static final double commissionRateZ = 0.11;

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //print header
    System.out.println("--------------------------------------------------------------");
    System.out.println("                      Practical Test 1");
    System.out.println("                    Code Subject: SC025");
    System.out.println("              Subject Name: Computer Science 2");
    System.out.println("--------------------------------------------------------------");

    //Prompt User Input
    System.out.print("Enter Student Name: ");
    String name = input.nextLine();
    System.out.print("Enter Practicum Class: ");
    String pracClass = input.nextLine();
    System.out.print("Enter Number of Brand A Computers Sold: ");
    int numA = input.nextInt();
    System.out.print("Enter Number of Brand Z Computers Sold: ");
    int numZ = input.nextInt();

    //calculation
    double totalA = pricePerUnitA * numA * commissionRateA;
    double totalZ = pricePerUnitZ * numZ * commissionRateZ;
    double totalA_Z = totalA + totalZ;

    System.out.println("Total Commission Brand A: RM " + totalA);
    System.out.println("Total Commission Brand Z: RM " + totalZ);
    System.out.println("Total Commision Brand A and Z : RM" + totalA_Z);
    System.out.println();
    System.out.println();// these two lines print nothing, just to leave two lines
    // print footer
    System.out.println("-----This Program Is Created by " + name + " From " + pracClass + "-----");
  }
}
