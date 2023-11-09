package javacollections;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(null);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != null) {
				list1.add(list.get(i));
			}
		}
		
		System.out.println(list1);
	}
}
