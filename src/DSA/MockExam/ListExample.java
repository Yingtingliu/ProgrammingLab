package DSA.MockExam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListExample {

	public static void pListSet(List<Integer> l, Set<Integer> s) {
		for (Integer i : l)
			System.out.print(i + " ");
		System.out.print("; ");
		for (Integer j : s)
			System.out.print(j + " ");
	}

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>(7);
//		Set<Integer> mySet = new TreeSet<Integer>();
		Set<Integer> mySet = new HashSet<Integer>();
		int temp = 0;
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0)
				temp = 8 - 2 * i;
			else
				temp = 10 - 2 * i;
			myList.add(i, temp);
			mySet.add(temp);
		}
		pListSet(myList, mySet);
	}

}
