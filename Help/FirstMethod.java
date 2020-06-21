import java.util.Scanner;
import java.lang.Math;

public class FirstMethod{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //finding the maximum size an array can hold
        double maxSize = (Math.pow(2.0,27.0));
        
        int size = (int)maxSize;
        
        //create arrays with maximum size
        String[] name = new String[size];
        double[] weight = new double[size];
        //record index
        double totalFly = 0,totalWelter = 0,totalHeavy = 0,totalFeather = 0;
        int maxFly = 0,maxWelter = 0,maxHeavy = 0,maxFeather = 0;
        int minFly = 0,minWelter = 0,minHeavy = 0,minFeather = 0;
        
        boolean repeat = true;
        
        int i = 0;
        double total = 0;
        while(repeat && i<weight.length){
            System.out.println("Student " + (i+1));
            System.out.println("Enter name: ");
            String nameHold = input.next();
            System.out.println("Enter weight: ");
            double weightHold = input.nextDouble();
            if(weightHold != -1){
                weight[i] = weightHold;
                name[i] = nameHold;
                System.out.print("Weight Class: ");
                if(weight[i] <= 58){
                    System.out.println("Flyweight");
                    totalFly += weight[i];
                }else if(weight[i] <= 68){
                    System.out.println("Featherweight");
                    totalFeather += weight[i];
                }else if(weight[i] <= 80){
                    System.out.println("Welterweight");
                    totalWelter += weight[i];
                }else{
                    System.out.println("Heavyweight");
                    totalHeavy += weight[i];
                }
                i++;
            }else{
                System.out.println("Quiting input session....");
                repeat = false;
                i--;
            }
            System.out.println();
        }
        double average = total / (i+1);
        System.out.println("Average: " + average);
        
        //finding min and max below
        String maxName = name[0];
        String minName = name[0];
        double minWeight = weight[0];
        double maxWeight = weight[0];
        for(int x=0;x<=i;x++){
            if(weight[x] > maxWeight){
                if (maxWeight < minWeight){
                    minWeight = maxWeight;
                    minName = maxName;
                }
                maxWeight = weight[x];
                maxName = name[x];
            }else if(weight[x] < minWeight){
                if (minWeight > maxWeight){
                    maxWeight = minWeight;
                    maxName = minName;
                }
                minWeight = weight[x];
                minName = name[x];
            }
        }
        System.out.println("Max weight: " + maxWeight);
        System.out.println("Min weight: " + minWeight);
    }
    public static void weightClass(double weight){
        System.out.print("Weight Class: ");
        if(weight <= 58){
            System.out.println("Flyweight");
        }else if(weight <= 68){
            System.out.println("Featherweight");
        }else if(weight <= 80){
            System.out.println("Welterweight");
        }else{
            System.out.println("Heavyweight");
        }
    }
}