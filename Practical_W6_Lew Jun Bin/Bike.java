import java.util.Scanner;

public class Bike{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// prompt user input
		System.out.println("What is your option?");
		int choice = input.nextInt();

		String name = "";
		if (choice == 1){
			name = "Mountain Bike";
		}else if (choice == 2){
			name = "Road Bike";
		}else if (choice == 3){
			name = "Fat Bike";
		}else if (choice == 4){
			name = "Hybrid Bike";
		}else{
			name = "Your choice is not in the list";
		}
		System.out.println(name);
	}
}