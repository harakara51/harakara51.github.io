package solutions;

public class Mileage {
	public static void main(String[] args) {
		int milesDriven = 350;
		float fuelConsumed = 14.2F;
		float fuelMileage = milesDriven / fuelConsumed;

		System.out.println("You drove " + milesDriven + " miles and consumed "
				+ fuelConsumed + " gallons of fuel.");
		System.out.println("You got " + fuelMileage + " miles per gallon.");
	}
}
