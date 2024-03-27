/*
 *  Student Name : Amirreza Mirzaei
 *  Lab Professor : Mel Sanschagrin
 *  Due Date : October 30, 2023
 *  Modified:
 *  Description: Lab Exercise 03
 */
package Cabbage;

import java.util.Scanner;
public class Driver {
	
	public static void main(String[] args) {
		// Creating a Scanner Object
		Scanner scan = new Scanner(System.in);

		//Adding a new cabbage constructor without arguments
		Cabbage cabbage = new Cabbage();

		// Declaring the variables: weight, costPerKilogram, and price
		double weight;
		double costPerKilogram;
		double price;
		
		System.out.print("Enter weight: ");
		// Using the scanner to get the value for weight
		weight = scan.nextDouble();
		
		System.out.print("Enter cost per kilogram: ");
		//Using the scanner to get the value for weight
		costPerKilogram = scan.nextDouble();
		
		//Set the weight and cost per kilogram of the cabbage here.
		cabbage.setWeight(weight);
		cabbage.SetCostPerKilogram(costPerKilogram);
		
		// Call the calculatePrice method of the cabbage object and assign its
		// return value to the price variable.		
		weight = cabbage.getWeight();
		costPerKilogram = cabbage.getCostPerKilogram();
		price = cabbage.calculatePrice();
		System.out.println("Cabbage weight is: " + weight);
		System.out.println("Cabbage cost per kilogram is: " + costPerKilogram);
		System.out.println("Cabbage price is: " + price);
		cabbage.calculatePrice();
		// Call the printReport method of the cabbage object here.
		cabbage.printReport();
		// Instantiate another cabbage object here by calling the overloaded
		// constructor and passing the arguments 3.5 and 2.50 for the weight and
		// costPerKilogram parameters, respectively.
		Cabbage anotherCabbage = new Cabbage(3.5, 2.5);
		// Call the printReport method of anotherCabbage object here.
		anotherCabbage.printReport();
		//Putting the name to be appeared on the output.
		System.out.println("Program completed by Amirreza Mirzaei");

		}
}
