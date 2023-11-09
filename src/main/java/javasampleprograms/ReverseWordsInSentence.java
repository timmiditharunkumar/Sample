package javasampleprograms;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String str = "Kumar Tarun Timmidi";
		String words[] = str.split(" ");
		String reverseSentence = "";
		for(int i=words.length-1; i>=0; i--) {
			reverseSentence = reverseSentence + words[i] + " ";
		}
		
		System.out.println(reverseSentence);
	}

}
