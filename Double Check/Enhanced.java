/*Author: Lew Jun Bin
  Class: F1T05A
  Description: This program is for Manager Director of Lawn Mown Rangers to manage its business
  Date of last modification: 18/1/2020
  */

import java.util.Scanner;
import java.util.Arrays;

public class Enhanced{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of houses: ");
    int numberOfHouse = input.nextInt();
    input.nextLine();
    System.out.println();

    // declare and create arrays with different data types
    String[] type = new String[numberOfHouse];
    String[] name = new String[numberOfHouse];
    double[] width = new double[numberOfHouse];
    double[] length = new double[numberOfHouse];
    double[] size = new double[numberOfHouse];
    double[] charges = new double[numberOfHouse];

    //prompt user input and read input and append elements into the array
    int i;
    for (i = 0; i < numberOfHouse; i++){
      System.out.print("Enter house type: ");
      type[i] = input.nextLine();
      System.out.print("Enter house owner: ");
      name[i] = input.nextLine();
      System.out.print("Enter width of mown land(in feet): ");
      width[i] = input.nextDouble();
      System.out.print("Enter length of mown land(in feet): ");
      length[i] = input.nextDouble();
      input.nextLine();

      //calculation
      size[i] = width[i] * length[i];
      charges[i] = size[i] * 10;

      System.out.println("Size area of mown land is " + size[i] + " square feet");
      System.out.println("Charges for the mown land is RM " + charges[i]);
      System.out.println();
    }

    /*Below shows the output
        Your Data
        Statistic*/

    //Your Data
    System.out.println();
    System.out.println(">>-------------------------------------------------Your Data------------------------------------------------->>");
    System.out.println("House Type\t\tHouse Owner\t\tWidth\tLength\tLand Size\t\tCharges");

    //for loop to display elements in array in table
    for (i=0; i<numberOfHouse; i++){
      System.out.println(type[i] + "\t\t" + name[i] + "\t\t\t" + width[i] + "\t" + length[i] + "\t" + size[i] + "\t\t\t" + charges[i]);
    }

    //for loop to accumulate total
    double total = 0;
    for (i=0; i<numberOfHouse;i++){
      total += charges[i];  //total charges
    }
    double average = total/charges.length;  //average charges

    //Statistic
    System.out.println("\n\n\n>>------------Statistic------------<<");
    System.out.println("Total charges:RM" + total);
    System.out.println("Average charges :RM" + average);

    //Search Tool
    System.out.println("\n\n\n>>----------------Search Tool----------------<<");
    System.out.print("Search charges above RM ");
    double searchValue = input.nextDouble();

    //search engine
    //for loop to find the number of results
    int count = 0;
    for (i=0; i<numberOfHouse; i++){
      if (charges[i]>searchValue){
        count++;
        }
      }
    String[] searchResult = new String[count];  //array to record all search results
    int x = 0;
    //for loop to perform linear search
    for (i=0; i<numberOfHouse; i++){
      if (charges[i]>searchValue){
        searchResult[x] = name[i];
        x++;
        }
      }
    if (searchResult.length == 0){
      System.out.println("Result not found. Please try with other value.");
    }else if(searchResult.length == 1){
      System.out.print("Charges above RM" + (int)searchValue + " belongs to " + searchResult[0]);
    }else{
      System.out.print("Charges above RM" + (int)searchValue + " belongs to " + searchResult[0]);
      for (i=1; i<searchResult.length; i++){
        if (searchResult[i] != null){
          System.out.print(" & " + searchResult[i] + " ");
        }
      }
    }
  }
}
