package solutions;

public class BMI3 {
	public static void main(String[] args) {
		int heightFeet = 5;
		int heightInches = 8;
		float weight = 150F;
		float bmi = (weight * 703)
				/ ((heightFeet * 12 + heightInches) * (heightFeet * 12 + heightInches));

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
}