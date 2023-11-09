package javaprograms;

public class MissingNumInArray {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int sum= 0;
		int len = a.length+1;
		int totalSum = len*(len+1)/2;
		for(int num : a) {
			sum = sum + num;
		}
		
		System.out.println(sum - totalSum);

	}

}
