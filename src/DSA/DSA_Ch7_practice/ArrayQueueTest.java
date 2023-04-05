package DSA.DSA_Ch7_practice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import DSA_Ch7_lecture.ArrayQueue;

public class ArrayQueueTest {
	
	@Test
	public void addQueue() {
		ArrayQueue<Integer> testArrayQueue = new ArrayQueue<Integer>(4);
		testArrayQueue.addLast(5);
		testArrayQueue.addLast(6);
		testArrayQueue.addLast(7);
		testArrayQueue.addLast(8);		
		System.out.println(testArrayQueue.toString());
		testArrayQueue.removeFirst();
		System.out.println(testArrayQueue.toString());
		testArrayQueue.addLast(10);
		assertTrue(testArrayQueue.getFirst()==0);
		testArrayQueue.addLast(15);
		assertTrue(testArrayQueue.getFirst()==1);
		
	}

}
