import java.util.Scanner;

public class HealthStatus{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//prompt user
		System.out.println("Please enter gender.")
		String string = input.nextLine().toLowerCase();
		char gender = string.charAt(0);
		

		System.out.println("Please enter waist measurement");
		double waist = input.nextDouble();
		String status = "";
		if (gender == m){
			if (waist < 37){
				status = "Low Risk";
			}else if(waist < 40){
				status = "Moderate Risk";
			}else if(waist >= 40){
				status = "High Risk";
			}
		}elseif (gender == f){
			if (waist <31.5){
				status = "Low Risk";
			}else if(waist < 35){
				status = "Moderate Risk";
			}else if(waist >= 35){
				status = "High Risk";
			}
		}else{
			status = "INVALID CODE ENTERED";
		}
		System.out.print(status);
	}
}