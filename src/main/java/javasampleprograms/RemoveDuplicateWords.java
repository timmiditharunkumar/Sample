package javasampleprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str = "India Won the asia cup, but australia dint won";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String words[] = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i].toLowerCase())) {
				map.put(words[i].toLowerCase(), map.get(words[i].toLowerCase()) + 1);
			} else {
				map.put(words[i].toLowerCase(), 1);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey()+ " ");
			}
		}
	}

}
