package DSA_Ch7_lecture;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue<E> {
	private E[] elems;
	private int size, front, rear;

	// ///////////// Constructor ///////////////
	@SuppressWarnings("unchecked")
	public ArrayQueue(int cap) {
		elems = (E[]) new Object[cap];
		size = front = rear = 0;
	}

	// ///////////// Accessors ///////////////
	public boolean isEmpty() {
		return (size == 0);
	}

	
	public int size() {
		return size;
	}

	public E getFirst() {
		if (size == 0)
			throw new NoSuchElementException();
		return elems[front];
	}

	// ////////////Transformers ///////////////
	@Override
	public void clear() {
		size = front = rear = 0;
	}

	public void addLast(E it) {
		if (size == elems.length)
			throw new ArrayIndexOutOfBoundsException();
		elems[rear++] = it; //if it's full and then remove first, we set rear as 0.
		if (rear == elems.length) 
			rear = 0;
		size++;
	}

	
	public E removeFirst() {
		if (size == 0)
			throw new NoSuchElementException();
		E frontElem = elems[front];
		elems[front++] = null;
		if (front == elems.length)
			front = 0;
		size--;
		return frontElem;
	}
	
	@Override
	public String toString() {
	  String aString = "";
	  for (int i = 0; i < size; i++) {
	    int index = (front + i) % elems.length;
	    aString += String.format("%s,", elems[index]);
	  }
	  return aString;
	}
}
