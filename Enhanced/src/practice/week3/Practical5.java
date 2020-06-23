/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.week3;

import java.text.DecimalFormat;

/**
 *
 * @author Autumn
 */
class Practical5a{
    public static void main(String[] args){
        System.out.println((55+9)%9);
        System.out.println(5+15/3*5-15%3);
    }
}

class Practical5b{
    public static void main(String[] args){
        String name = "Haira";
        int hoursWorked = 37;
        double payRate = 6.70;
        double grossPay = hoursWorked * payRate;
        
        System.out.println("The gross pay for " + name + " is: RM " + grossPay);
        
        // Another method
        // DecimalFormat df = new DecimalFormat("#.00");
        // String sb = df.format(grossPay);
        // System.out.print("The gross pay for " + name + " is: RM " + sb);
        
        //Another method
        // System.out.printf("The gross pay for %s is: RM %.2f\n", name, grossPay);
    }
}
