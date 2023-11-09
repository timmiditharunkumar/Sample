package javasampleprograms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWords {

	public static void main(String[] args) {
		String str = "my name is tarun Tarun hello Hello";
		String words[] = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i].toLowerCase())) {
				map.put(words[i].toLowerCase(), map.get(words[i].toLowerCase()) + 1);
			} else {
				map.put(words[i].toLowerCase(), 1);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

}
