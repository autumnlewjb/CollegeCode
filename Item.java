/*Description: this is another edition of Price.java that uses OOP
 *Author: Lew Jun Bin
 *Date: 6/12/2019
*/

import java.util.Scanner;

public class Item{
  String name;
  double price;
  int quantity;
  double totalPrice;
  public Item(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  public void setName(String input){
    name = input;
  }
  public void setPrice(double input){
    price = input;
  }
  public void setQuantity(int input){
    quantity = input;
  }

  public void display(){
    System.out.println("Name: " + name);
    System.out.println("Price " + price);
    System.out.println("Quantity: " + quantity + "\n");
  }

  public double total(double newPrice){
    totalPrice = newPrice + totalPrice;
    return totalPrice;
  }
  public double average(int numberItems){
    double averagePrice = totalPrice / numberItems;
    return averagePrice;
  }

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

    int count;

		System.out.println("Enter number of items that you had bought.");
		int numberOfItems = input.nextInt();
    input.nextLine();

    for (count = 1; count <= numberOfItems; count++){
      System.out.println("Enter name of your purchase: ");
      String name = input.nextLine();

  		System.out.println("Enter price of your " + count + " item.");
  		double price = input.nextDouble();

      System.out.println("Enter quantity of your " + count + " item.");
  		int quantity = input.nextInt();
      input.nextLine();

      Item things = new Item(name, price, quantity);

    	//System.out.println("Your total price is RM " + totalPrice);
    	//System.out.println("Your average price is RM " + average(numberOfItems));

    }
    things.display();
	}
}
