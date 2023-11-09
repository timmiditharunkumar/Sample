package javasampleprograms;

public class ExtractLastFourChars {

	public static void main(String[] args) {
		String str = "Tarundfgthyujikjhgfdcfvgbhnjtarunabcd";
		String lastFourChars = "";
		if(str.toCharArray().length > 4) {
			lastFourChars = str.substring(str.toCharArray().length-4);
		}else {
			lastFourChars = str;
		}
		System.out.println(lastFourChars);

	}

}
