package javasampleprograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s = "Tarun ^ &* is My Na#$%mez";
		String dummy = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122 
					|| s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				dummy = dummy + s.charAt(i);
			}
		}
		System.out.println(dummy);

		String str = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
	}

}
