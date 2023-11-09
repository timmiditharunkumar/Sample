package javasampleprograms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChars {

	public static void main(String[] args) {
		String str = "hello";
		char ch[] = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
