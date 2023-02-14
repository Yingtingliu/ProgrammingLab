package DSA_Ch7_lecture;

public interface Deque<E> extends Queue<E> {
	
	public void addFirst (E it);
	//add it to front of deque
	
	public E removeLast ();
	// Remove and return the rear element of this queue.
	
	
	public E getLast ();
	// Return the element at the rear of this queue.

}
