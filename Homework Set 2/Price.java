/*Description: This program is to determine the total and average price for a few items.
 *Author: Lew Jun Bin
 *Date modified: 6/12/2019
*/

import java.util.Scanner;

public class Price{
	static double totalPrice = 0;
	public static double total(double newPrice){
		totalPrice = newPrice + totalPrice;
		return totalPrice;
	}
	public static double average(int numberItems){
		double averagePrice = totalPrice / numberItems;
		return averagePrice;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of items that you had bought.");
		int numberOfItems = input.nextInt();

		int count = 1;
		while (count <= numberOfItems){
			System.out.println("Enter price of your " + count + " item.");
			double price = input.nextDouble();
			total(price);
			count ++;
		}
		
		System.out.println("Your total price is RM " + totalPrice);
		System.out.println("Your average price is RM " + average(numberOfItems));
	}
}