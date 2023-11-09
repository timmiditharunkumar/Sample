package javaprograms;

public class Factorial {

	public static void main(String[] args) {
		int n = 3;
		int fact = 1;
//		while (n > 0) {
//			fact = fact * n;
//			n--;
//		}
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		System.out.println( fact);

	}

}
