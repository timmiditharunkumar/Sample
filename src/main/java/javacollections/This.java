package javacollections;

public class This extends ThisOne {

	int a, b;

	public This() {
		System.out.println("this is constructor");
	}
	
	public This(int a) {
		this();
	}
	
	public This(int a, int b) {
		this(10);
	}

	public void sum(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + b);

		System.out.println(this.a);
		System.out.println(this.b);
	}

	public void test() {
		
		System.out.println("test");
		this.sum(1, 2);
		this.test1();
		super.sum(a, b);
	}

	public void test1() {
		System.out.println("test1");
	}

	public static void main(String[] args) {
//		This s = new This();
//		s.test();
		ThisOne one = new ThisOne();
		one.sum(1, 2);
	}

}
