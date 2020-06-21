import java.util.Scanner;
import java.util.Arrays;

public class MonthlySavings{
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args){
    System.out.print("Enter name : ");
    String name = input.nextLine();

    System.out.print("Enter number of month : ");
    int noOfMonth = input.nextInt();
    input.nextLine();
    System.out.println();


    String[] monthA = new String[noOfMonth];
    double[] budgetA = new double[noOfMonth], expenseA = new double[noOfMonth],
    savingsA = new double[noOfMonth];

    int i;
    double totalSavings = 0;
    for (i=0; i<noOfMonth; i++){
      System.out.print("Enter month : ");
      String month = input.nextLine();

      System.out.print("Enter budget for " + month + " : RM ");
      double budget = input.nextDouble();

      System.out.print("Enter expenses for " + month + " : RM ");
      double expense = input.nextDouble();
      input.nextLine();
      System.out.println();


      monthA[i] = month;
      budgetA[i] = budget;
      expenseA[i] = expense;
      savingsA[i] = budget - expense;
      totalSavings += savingsA[i];
    }
    double average = totalSavings / noOfMonth;
    System.out.println("Total savings in " + noOfMonth + " months = RM " + totalSavings);
    System.out.println("Average savings in " + noOfMonth + " months = RM " + average);
    System.out.print("\nEnter search value for the savings above RM...... ");
    double searchValue = input.nextDouble();

    System.out.println("\nSAVINGS REPORT:");
    int count = 0;
    for (i=0 ; i<noOfMonth ; i++){
      if(savingsA[i]>searchValue){
        System.out.println(monthA[i] + "\t\t\tRM " + savingsA[i]);
        count++;
      }
    }
    if (count == 0){
      System.out.println("INVALID INPUT");
    }
  }
}
