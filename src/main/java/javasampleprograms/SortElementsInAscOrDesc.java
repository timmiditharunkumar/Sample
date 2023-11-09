package javasampleprograms;

import java.util.Arrays;

public class SortElementsInAscOrDesc {

	public static void main(String[] args) {
		int[] a = { 40, 60, 50, 10, 20, 30 };
		int temp = 0;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			} 
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(a));

	}

}
