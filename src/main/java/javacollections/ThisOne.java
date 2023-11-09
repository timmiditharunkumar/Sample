package javacollections;

public class ThisOne {
	int a, b;

	public void sum(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + b);

		System.out.println(this.a);
		System.out.println(this.b);
	}
}
