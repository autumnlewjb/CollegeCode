package practice.week6;

import java.util.Scanner;

public class Practical5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //prompt user
        System.out.println("Please enter gender.");
        char gender = input.nextLine().toLowerCase().charAt(0);
        
        String status;
        
        if (gender == 'm'){
            System.out.println("Please enter waist measurement");
            double waist = input.nextDouble();
            
            if (waist < 37){
                status = "Low Risk";
            }else if(waist < 40){
                status = "Moderate Risk";
            }else{
                status = "High Risk";
            }
            
        }else if (gender == 'f'){
            
            System.out.println("Please enter waist measurement");
            double waist = input.nextDouble();
            if (waist <31.5){
                status = "Low Risk";
            }else if(waist < 35){
                status = "Moderate Risk";
            }else{
                status = "High Risk";
            }
            
        }else{
            
            status = "INVALID CODE ENTERED";
            
        }
        
        System.out.print(status);
    }
}