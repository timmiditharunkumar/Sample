package javasampleprograms;

public class CharBasedOfIndex {

	public static void main(String[] args) {
		String str = "demo";
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j <= str.indexOf(ch[i]); j++) {
				System.out.print(ch[i]);
			}
		}
	} 
}
