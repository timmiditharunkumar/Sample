package javasampleprograms;

public class LastLetterOfEachWord {

	public static void main(String[] args) {
		String s = "Myv Namei isr taruna t";
		String[] words = s.split(" ");
		for(int i=0; i<words.length; i++) {
			words[i].length();
			System.out.print(words[i].substring(words[i].length()-1));
		}

	}

}
