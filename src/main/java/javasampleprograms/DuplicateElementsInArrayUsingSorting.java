package javasampleprograms;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElementsInArrayUsingSorting {

	public static void main(String[] args) {
		int a[] = new int[] {0,0,1,1,2,2,3,4,5};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> dummySet = new HashSet<Integer>();
		for(int ele : a) {
			if(!set.add(ele)) {
				dummySet.add(ele);
			}
		}
		
		System.out.println(dummySet);
	}

}
