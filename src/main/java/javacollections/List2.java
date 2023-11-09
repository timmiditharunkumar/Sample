package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Tarun", "Charan", "Sindhu", "Virat", "Dhoni", "", null));
		ArrayList<String> list1 = new ArrayList<>();
//		list.add("Tarun");
//		list.add("Sindhu");
//		list.add("Charan");
//		list.add("Virat");
//		list.add("Dhoni");
//		list.add("");
//		list.add(null);
//		Collections.addAll(list, "Tarun", "Charan", "Sindhu", "Virat", "Dhoni", "", null);
		

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != null && !list.get(i).isEmpty()) {
				list1.add(list.get(i));
			}
			
			if(list.get(i) != null && list.get(i).equals("Charan")) {
				System.out.println(i);
			}
		}

		System.out.println(list1);
		
		compare();
	}
	
	public static void compare() {
		String a = "Tarun";
		String b= "Sindhu";
		String c = new String("Tarun");
		String d = "Tarun";
		
		System.out.println(a.equals(c));
		System.out.println(a==d);
	}

}
