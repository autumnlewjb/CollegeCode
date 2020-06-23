package practice.week3;

import java.util.Scanner;

class Practical6a {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("Enter First Number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = input.nextInt();
        System.out.println("Enter Third Number: ");
        num3 = input.nextInt();
        System.out.println("The result is: " + (num1 + num2 / num3 * num1 - num2 % num3));
    }
}
class Practical6b {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter hours worked: ");
        int hoursWorked = input.nextInt();
        System.out.print("Enter pay rate: ");
        double payRate = input.nextDouble();
        double grossPay = hoursWorked * payRate;
        System.out.printf("The gross pay for %s is: RM %.2f", name, grossPay);
    }
}
