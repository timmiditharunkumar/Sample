package javaprograms;

public class EvenOrOdd {

	public static void main(String[] args) {
		int n = 6;
		int count =0;
		
		while(n%2==0) {
			count++;
			n--;
		}
		
		if(count>0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}

}
