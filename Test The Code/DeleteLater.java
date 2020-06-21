import java.util.Scanner;
public class DeleteLater
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter name : ");
        String name=input.nextLine();
        System.out.print("Enter number of month : ");
        int n_Month=input.nextInt();
        String[] month=new String[n_Month];
        double[] savings=new double[n_Month];
        input.nextLine();
        double total=0;

        for(int i=0;i<n_Month;i++)
        {System.out.print("\nEnter month : ");
         month[i]=input.nextLine();
         System.out.print("Enter budget for "+month[i]+" : RM ");
         double budget=input.nextDouble();
         System.out.print("Enter expenses for "+month[i]+" : RM ");
         double expenses=input.nextDouble();
         input.nextLine();
         savings[i]=budget-expenses;
         total=total+savings[i];
        }

        System.out.println("\nTotal savings in 5 months = RM "+total);
        double average=total/n_Month;
        System.out.println("Average savings in 5 months = RM "+average);

        System.out.print("\nEnter search value for savings above RM...... ");
        double key=input.nextDouble();

        System.out.println("\nSAVINGS REPORT:");
        for(int i=0;i<n_Month;i++)
        {
          if(savings[i]>key)
            {System.out.printf("%-15s",month[i]);
             System.out.printf("%-3s%-3.2f\n","RM",savings[i]);}
          else
            {System.out.print("No value is found.");}
        }
    }
}
