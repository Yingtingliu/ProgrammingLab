package AP.AP_Test_Lab4;

import java.util.*;

import org.junit.*;



public class TreeSetTest {
	@Test
	public void whenUsingHeadSet_shouldReturnHeadSetElements() {
	    SortedSet<Integer> treeSet = new TreeSet();
	    treeSet.add(1);
	    treeSet.add(2);
	    treeSet.add(3);
	    treeSet.add(4);
	    treeSet.add(5);
	    treeSet.add(6);

	    Set<Integer> subSet = treeSet.headSet(6);
	 
//	    assertTrue(subSet.containsAll(treeSet.subSet(1, 6)));
	}
	
	

	
}
