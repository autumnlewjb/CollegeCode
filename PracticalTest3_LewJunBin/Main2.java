import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class Main2{
    static Scanner input = new Scanner(System.in);
    String name;
    String id;
    double sales;
    public Main2(String dropshipName, String dropshipId, double salesOfTheMonth){
        name = dropshipName;
        id = dropshipId;
        sales = salesOfTheMonth;
    }
    
    public void displayTable(){
        out.println(name + "\t\t" + id + "\t\t" + sales);
    }
    public static void main(String[] args){
        final int size = 3;
        Main2[] record = new Main2[size];
        
        int i;
        double total = 0;
        for(i=0;i<record.length;i++){
            out.print("Enter name: ");
            String name = input.nextLine();
            out.print("Enter ID: ");
            String id = input.nextLine();
            out.print("Enter sales: ");
            double sales = input.nextDouble();
            input.nextLine();
            record[i] = new Main2(name,id,sales);
            total += record[i].sales;
        }
        double average = total/record.length;
        
        //finding max
        int highestIndex = 0;
        for(i=0;i<record.length;i++){
            if(record[i].sales > record[highestIndex].sales){
                highestIndex = i;
            }
        }
        
        final double searchValue = 10000;
        int found = 0;
        for(i=0;i<record.length;i++){
            if(record[i].sales>searchValue){
                record[i].displayTable();
                found++;
            }
        }

        out.println();
        out.println("No of Found Result: " + found);
    }
}