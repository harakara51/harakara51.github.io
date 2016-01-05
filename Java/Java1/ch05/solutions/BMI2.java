package solutions;

public class BMI2 {
	public static void main(String[] args) {
		int heightFeet = 5;
		int heightInches = 8;
		float weight = 150F;
		float bmi = (weight * 703)
				/ ((heightFeet * 12 + heightInches) * (heightFeet * 12 + heightInches));

		System.out.println("A person " + heightFeet + "'" + heightInches
				+ "\" tall who weighs " + weight
				+ " pounds has a body mass index of " + bmi + ".");
	}
}
