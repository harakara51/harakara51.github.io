package solutions;

public class MinMax2 {
	public static void main(String[] args) {
		int[] numbers = {28, 33, 55, 21, 35, 15, 66, 9, 23, 44};
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
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
