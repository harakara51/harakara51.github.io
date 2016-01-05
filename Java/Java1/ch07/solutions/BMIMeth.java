package solutions;

public class BMIMeth {
	public static void main(String[] args) {
		int heightFeet = 5;
		int heightInches = 8;
		float weight = 150F;
		float bmi = computeBMI(heightFeet * 12 + heightInches, weight);

		System.out.print("A person " + heightFeet + "'" + heightInches
				+ "\" tall who weighs " + weight
				+ " pounds has a body mass index of " + bmi + " which is ");
		
		if (bmi < 18.5) {
			System.out.println("Underweight.");
		}
		else if (bmi <= 24.9) {
			System.out.println("Normal.");
		}
		else if (bmi <= 29.9) {
			System.out.println("Overweight.");
		}
		else {
			System.out.println("Obese.");
		}	
	}
	
	public static float computeBMI(int height, float weight) {
		
		float bodyMassIndex = (weight * 703)
				/ (height * height);

		return bodyMassIndex;
	}

}
