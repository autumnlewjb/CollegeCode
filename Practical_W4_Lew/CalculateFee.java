import java.util.Scanner;

public class CalculateFee{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of OpenOffice Student: ");
        int noStudent00 = input.nextInt();
        
        System.out.println("Enter number of Multimedia student: ");
        int noStudentMM = input.nextInt();
        
        //the formula
        int totalFee00 = 80 * noStudent00;
        int totalFeeMM = 100*noStudentMM;
        int totalAll = totalFee00 + totalFeeMM;
        
        System.out.println("Total Fee for OpenOffice: RM " + totalFee00);
        System.out.println("Total Fee for Multimedia: RM " + totalFeeMM);
        System.out.println("Total fee for all course: RM" + totalAll);
    }
}
