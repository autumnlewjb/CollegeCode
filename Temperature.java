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

		int count; 
		int totalTemp = 0;
		for (count = 0; count < days; count++){
			System.out.println("Enter daily average temperature: ");
			double temp = input.nextDouble();
			totalTemp += temp;
		}
	}		
}