import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sizeInDou = Math.pow(2.0,26.0);
        int size = (int)sizeInDou;
        String[] name = new String[size];
        double[] weight = new double[size];
        String[] weightClass = new String[size];
        String[] allClass = {"Heavyweight","Welterweight","Featherweight","Flyweight"};
        
        int i = 0;
        System.out.print("Enter name: ");
        String nameHolder = input.next();
        System.out.print("Enter weight: ");
        double weightHolder = input.nextDouble();
        
        while(weightHolder != -1 && i<size){
            name[i] = nameHolder;
            weight[i] = weightHolder;
            weightClass[i] = findClass(weight[i],allClass);
            System.out.println("Weight Class:" + weightClass[i]);
            System.out.println();
            i++;
            System.out.println("Enter name: ");
            nameHolder = input.next();
            System.out.println("Enter weight: ");
            weightHolder = input.nextDouble();
        }
        
        //find total, max and min for each class
        
        for(int x=0;x<allClass.length;x++){
            int y = 0;
            int num = 0;
            double total = 0;
            String maxName = null, minName = null;
            double maxWeight = 0, minWeight = 0;
            while (y<i){
                
                if(weightClass[y].equalsIgnoreCase(allClass[x])){
                    total += weight[y];
                    num++;
                    if(num == 1){
                        maxName = name[y];
                        minName = name[y];
                        maxWeight = weight[y];
                        minWeight = weight[y];
                    }
                    if(weight[y] > maxWeight){
                        if(maxWeight < minWeight){
                            minWeight = maxWeight;
                            minName = maxName;
                        }
                        maxWeight = weight[y];
                        maxName = name[y];
                    }else if(weight[y] < minWeight){
                        if(minWeight > maxWeight){
                            maxWeight = minWeight;
                            maxName = minName;
                        }
                        minWeight = weight[y];
                        minName = name[y];
                    }
                }
                
                y++;
            }
            double average = total / num;
            System.out.println(allClass[x]);
            System.out.println("Average: " + average);
            System.out.println("Max Name: " + maxName);
            System.out.println("Max Weight: " + maxWeight);
            System.out.println("Min Name: " + minName);
            System.out.println("Min Weight: " + minWeight);
            System.out.println();
        }
    }
    public static String findClass(double weight, String[] arr){
        final String a = arr[0];
        final String b = arr[1];
        final String c = arr[2];
        final String d = arr[3];
        if(weight <= 58){
            return d;
        }else if(weight <= 68){
            return c;
        }else if(weight <= 80){
            return b;
        }else{
            return a;
        }
    }
}