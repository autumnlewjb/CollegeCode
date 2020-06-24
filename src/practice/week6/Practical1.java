package practice.week6;

import java.util.Scanner;

public class Practical1{
    // directly procees to multiple selection
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //prompt user input
        System.out.print("Enter running distance in km: ");
        double distance = input.nextDouble();

        if (distance >= 42){
                System.out.println("Full Marathon");
        }else if (distance >= 21){
                System.out.println("Half Marathon");
        }else{
                System.out.println("Fun Run");
        }
    }
}
			