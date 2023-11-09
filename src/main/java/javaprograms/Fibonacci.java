package javaprograms;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1, sum;
		System.out.print(a + ", " + b);
		for (int i = 0; i < n; i++) {
			sum = a + b;
			System.out.print(", "+sum);
			a = b;
			b = sum;
		}
	}

}
