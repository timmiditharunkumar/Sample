package javasampleprograms;

public class NumberOfAplhabetsInString {

	public static void main(String[] args) {
		String s = "my name is tarun #$%^&%$%";
		int count = 0, chCount = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != ' ') {
				count++;
			}
			
			//--------------------------------------
			if(Character.isLetter(s.charAt(i))) {
				chCount++;
			}
		}
		
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());

	}

}
