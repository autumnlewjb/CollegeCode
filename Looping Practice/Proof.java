import java.util.Scanner;

public class Proof{
    public static void main(String[] args){
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter price: ");
            double price = input.nextDouble();
            //input.nextLine();
            System.out.print("Enter name: ");
            String name = input.next();
            System.out.println(name);
        }
    }
}