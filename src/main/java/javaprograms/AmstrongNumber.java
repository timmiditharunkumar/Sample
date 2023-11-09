package javaprograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int sum=0, temp=n, r;
		while(n>0){
			r = n%10;
			sum = sum + (r*r*r);
			n = n/10;
		}

		if(temp==sum) {
			System.out.println("Is Amstrong number");
		}
	}

}
