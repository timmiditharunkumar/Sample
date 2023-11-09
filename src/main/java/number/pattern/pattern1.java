package number.pattern;

public class pattern1 {

	public static void main(String[] args) {
		int n = 5;
		int k=2;
		for (int i = 1, p = 5; i < n; i++, p--) {
			for (int j = 1, q = 0; j < n; j++, q++) {
				System.out.print(i*j);
				k+=2;
			}
			System.out.println();
		}

	}

}
