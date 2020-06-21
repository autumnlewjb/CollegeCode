package practice.week7;

import java.util.Scanner;

public class Practical4{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        char gender = 'a'; //to enter loop only
        int totalMale = 0, totalFemale = 0;
        
        do{
            if(gender == 'm'){
                totalMale+=1;
            }else if(gender == 'f'){
                totalFemale+=1;
            }
            System.out.print("Enter gender M for male or F for female: ");
            gender = input.nextLine().toLowerCase().charAt(0);
            
        }while (gender != 'z');
        
        System.out.println("\n\nTotal Male students: " + totalMale);
        System.out.println("Total Female students: " + totalFemale);
    }
}
