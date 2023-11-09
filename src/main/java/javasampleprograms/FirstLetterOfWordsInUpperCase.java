package javasampleprograms;

public class FirstLetterOfWordsInUpperCase {

	public static void main(String[] args) {
		String s = "hello welcome all";
		String words[] = s.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			char ch = Character.toUpperCase(words[i].charAt(0));
			String rest = words[i].substring(1);
			builder.append(ch).append(rest).append( " ");
		}
		
		System.out.println(builder);

	}

}
