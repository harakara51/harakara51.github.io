package solutions;

public class BMI {
	public static void main(String[] args) {
		int height = 68;
		float weight = 150F;
		float bmi = (weight * 703) / (height * height);

		System.out.println("A person " + height + " inches tall who weighs "
				+ weight + " pounds has a body mass index of " + bmi + ".");
	}
}
