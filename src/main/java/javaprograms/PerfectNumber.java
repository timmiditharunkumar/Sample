package javaprograms;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 6;
		int temp, sum = 1;
		temp=num;
		
		for(int i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum = sum * i;
			}
		}
		
		if(temp == sum)
		{
			System.out.println("Perfect Number");
		}
	}

}
