package javasampleprograms;

public class SqrtOfNum {

	public static void main(String[] args) {
		int n = 25;
		double temp = 0, sqrt = n/2;
		
		do {
			temp = sqrt;
			sqrt = (temp+(n/temp))/2;
		}while(temp-sqrt != 0);

		System.out.println(sqrt);
	}

}
