package javasampleprograms;

public class SmallestrAndLagestEleInArray {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int min , max;
		min =max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			else if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}
