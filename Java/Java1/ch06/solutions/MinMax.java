package solutions;

public class MinMax {
	public static void main(String[] args) {
		int[] numbers = {28, 33, 55, 21, 35};
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i = 1; i < 5; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
