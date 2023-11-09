package javasampleprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Tarun", "Charan", "Sindhu", "Virat", "Dhoni", "", null));
		String[] a = list.toArray(new String[list.size()]);

		for(String ele : a) {
			System.out.println(ele);
		}
	}
 
}
