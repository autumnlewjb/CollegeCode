package practice.week7;

import java.util.Scanner;

public class PracticalFour{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        char gender = 'M'; //to enter loop
        int totalMale = 0;
        int totalFemale = 0;
        System.out.print("Enter gender M for male or F for female: ");
        gender = input.nextLine().toLowerCase().charAt(0);
        while(gender != 'z'){
            if(gender == 'm'){
                totalMale+=1;
            }else if(gender == 'f'){
                totalFemale+=1;
            }else{
                System.out.println("INVALID");
            }
            System.out.print("Enter gender M for male or F for female: ");
            gender = input.nextLine().toLowerCase().charAt(0);
        }


        System.out.println("\n\nTotal Male students: " + totalMale);
        System.out.println("Total Female students: " + totalFemale);
    }
}
