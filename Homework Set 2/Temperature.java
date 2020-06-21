/*Description:This program is to calculate the total temperature.
 *Author: Lew Jun Bin
 *Date modified: 6/12/2019
*/

import java.util.Scanner;

public class Temperature{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter number of days: ");
		int days = input.nextInt();

		int count = 1; 
		int totalTemp = 0;
		while (count <= days){
			System.out.println("Enter daily average temperature on Day " + count + ": ");
			double temp = input.nextDouble();
			totalTemp += temp;
			count++;
		}
		System.out.println("The total temperature is " + totalTemp +" Degree Celsius");
	}		
}