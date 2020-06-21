/* Description: This program is to calculate voltage drop for Mr Faris Aiman
 * Author: Lew Jun Bin
 * Date modified: 5/12/2019
*/

import java.util.Scanner;

public class VoltageDrop{
	public static void main (String[] args){
		// print header
		System.out.println("-------------------------------------------------------");
		System.out.println("			Practical Test 1");
		System.out.println("		       Code Subject: SC025");
		System.out.println("		Subject Name: Computer Science 2");
		System.out.println("-------------------------------------------------------");

		//body
		//prompt user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String name = input.nextLine();
		
		System.out.print("Enter Practicum Class : ");
		String prac = input.nextLine().toUpperCase();

		System.out.print("Enter total length of wire in metres : ");
		double wireLength = input.nextDouble();
		
		System.out.print("Enter current (amps) through wire : ");
		double current = input.nextDouble();

		System.out.print("Enter cross sectional area of copper in square millimetres : ");
		double area = input.nextDouble();
		
		//calculation
		double volt = (wireLength * current * 0.017) / area;

		System.out.println("Voltage drop = " + volt + " V");
		
		System.out.println();
		System.out.println();
		
		//print footer
		System.out.println("-----This Program Is Created By " + name +" From " + prac + "-----");
	}
}