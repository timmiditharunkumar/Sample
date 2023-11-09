package javasampleprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedNumber {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 20, 20 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue().equals(list.get(list.size()-1)))
			System.out.println(entry.getKey());
		}

	}

}
