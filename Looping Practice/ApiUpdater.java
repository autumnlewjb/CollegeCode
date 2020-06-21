import java.util.Scanner;

public class ApiUpdater{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int count;
		int apiComparison = 0;
		String highestDistrict = "";
		for (count = 0; count < 10; count ++){
			System.out.println("\nEnter District's Name: ");
			String disName = input.nextLine();
			
			System.out.print("\nEnter API for this district: ");
			int api = input.nextInt();
			
			// always record the highest API district and their API
			if (api > apiComparison){
				api = apiComparison;
				highestDistrict = disName;
			}
		}
		System.out.println("The highest API district is " + highestDistrict + " with API " + apiComparison);
	}
}