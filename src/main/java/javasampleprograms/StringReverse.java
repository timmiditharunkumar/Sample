package javasampleprograms;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Tarun";
		String reverseString = "";
		char ch[] = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println(reverseString);
	}
}
