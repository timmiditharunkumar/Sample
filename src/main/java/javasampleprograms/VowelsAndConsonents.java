package javasampleprograms;

public class VowelsAndConsonents {

	public static void main(String[] args) {
		String str = "tarun";
		int consonents = 0, vowels = 0;
		String con ="", vow = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowels++;
				vow = vow + str.charAt(i);
			}
			
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				consonents++;
				con = con + str.charAt(i);				
			}
		}
		
		System.out.println(vow);
		System.out.println(con);
	}

}
