import java.util.Scanner;

public class CalculateTicket{
    static double adult = 15.0;
    static double children = 6.0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        System.out.println("Enter number of adult: ");
        int numberOfAdult = input.nextInt();
        
        double priceChildren = children*numberOfChildren ;
        double priceAdult = adult * numberOfAdult;
        double total = priceChildren + priceAdult;
        System.out.println("Amount payable: " + total);
    }
}