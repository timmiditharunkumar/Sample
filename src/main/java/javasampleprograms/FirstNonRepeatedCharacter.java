package javasampleprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "Tarun Kumar tttt";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if(Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
			}
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (!entry.getKey().equals(' ') && entry.getValue()==1) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
				break;
			}
		}
	}

}
