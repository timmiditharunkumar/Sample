package javasampleprograms;

public class LongestString {

	public static void main(String[] args) {
		String s = "hello welcome all";
		String words[] = s.split(" ");
		String max = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > max.length()) {
				max = words[i];
			}
		}
		System.out.println(max);

	}

}
