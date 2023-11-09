package javasampleprograms;

public class ReverseEachWordsInSentence {

	public static void main(String[] args) {
		String str = "Tarun is my name";
		String words[] = str.split(" ");
		
		String reverseSentence = "";
		
		for(int i=0; i<words.length; i++) {
			String reverseString = "";
			char ch[] = words[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--) {
				reverseString = reverseString + words[i].charAt(j);
			}
			reverseSentence = reverseSentence + reverseString + " ";
		}
		System.out.println(reverseSentence);
	}

}
