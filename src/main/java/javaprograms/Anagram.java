package javaprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str = "mary";
		String str1 = "army";
		
		char[] ch1 = str.toCharArray();
		char[] ch2 = str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("is Anagram");
		}

	}

}
