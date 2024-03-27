/*
 *  Student Name : Amirreza Mirzaei
 *  Lab Professor : Mel Sanschagrin
 *  Due Date : October 30, 2023
 *  Modified:
 *  Description: Lab Exercise 3
 */
package Cabbage;

public class Cabbage {
	// Creating the instance variables for the cabbage class
	private double weight;
	private double costPerKilogram;
	// Creating a constructor without an argument
	public Cabbage() {
		
	}
	// A constructor with an argument(weight and costPerKilogram)
	public Cabbage(double weight, double costPerKilogram) {
		this.weight = weight;
		this.costPerKilogram = costPerKilogram;
	}
	
	// Using getters and setters in the following lines
	public double getWeight() {
		return weight;
	}

	public void setWeight (double weight) {
		this.weight = weight;
	}
	

	public double getCostPerKilogram() {
		return costPerKilogram;
	}

	public void SetCostPerKilogram(double costPerKilogram) {
		this.costPerKilogram = costPerKilogram;
	}
	// Using calculatePrice to calculate the price by multiplying the weight and costPerKilogram 
	public double calculatePrice(){
		double calculatePrice = (weight * costPerKilogram);
		return calculatePrice;
	}

	/*
	 * Worker method that outputs a report to console
	 * in format of "Cabbage: weight x, cost per kilogram y".
	 * Note that it adds a line return on the end
	 * of the output.
	 */
	public void printReport() {
		System.out.println("Cabbage: weight " + weight + ", cost per kilogram " + costPerKilogram);
	}
	


}
